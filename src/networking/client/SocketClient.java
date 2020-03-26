package networking.client;

import view.chatview.ChatViewController;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class SocketClient implements Client{

    private PropertyChangeSupport property = new PropertyChangeSupport(this);
    private ChatViewController chatViewController;


    public void start() throws IOException, ClassNotFoundException {
        Socket socket = new Socket("localhost", 3120);

        ClientSocketHandler handler = new ClientSocketHandler(socket, this);
        Thread thread = new Thread(handler);
        thread.setDaemon(true);
        thread.start();
        property.firePropertyChange("NewUser", null, thread);  //Fires when the client connects

        Scanner input = new Scanner(System.in);

        while (true) {
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
        //chatViewController.addToChat(message);
        property.firePropertyChange("Message", null, message);  //Fires when the client receives a message from the server
    }

    @Override
    public void addListener(String name, PropertyChangeListener listener) {
        property.addPropertyChangeListener(name, listener);
    }

    @Override
    public void removeListener(String name, PropertyChangeListener listener) {
        property.removePropertyChangeListener(name, listener);
    }
}
