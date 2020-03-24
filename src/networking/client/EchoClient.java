package networking.client;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class EchoClient {

    public void start() throws IOException, ClassNotFoundException {
        Socket socket = new Socket("localhost", 3120);

        ClientSocketHandler handler = new ClientSocketHandler(socket, this);
        Thread thread = new Thread(handler);
        thread.setDaemon(true);
        thread.start();

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
    }
}
