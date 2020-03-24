package networking.client;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class EchoClient implements Client{

    private PropertyChangeSupport property = new PropertyChangeSupport(this);

    public void start() throws IOException, ClassNotFoundException {
        Socket socket = new Socket("localhost", 3120);

        ClientSocketHandler handler = new ClientSocketHandler(socket, this);
        Thread thread = new Thread(handler);
        thread.setDaemon(true);
        thread.start();
        property.firePropertyChange("UserList", null, thread);

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Input> ");
            String arg = input.nextLine();  //Reads message from client
            handler.sendMessage(arg);   //Gives message to the handler

            if (arg.equalsIgnoreCase("exit")){
                socket.close();
                break;
            }
        }
    }

    public void messageReceived(String message) {
        System.out.println(message);
        property.firePropertyChange("Message", null, message);
    }

    @Override
    public void addListener(String name, PropertyChangeListener listener) {
        property.addPropertyChangeListener("Message", listener);
    }

    @Override
    public void removeListener(String name, PropertyChangeListener listener) {
        property.removePropertyChangeListener("UserList", listener);
    }
}
