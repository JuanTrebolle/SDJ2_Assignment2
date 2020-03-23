/**
 * Server it's only responsible for creating connections with the clients and spawning a new thread for each client
 */

package Networking.server;

import Networking.shared.Message;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
    public void start() throws IOException {
        ServerSocket welcomeSocket = new ServerSocket(2910);
        System.out.println("Server started...");
        ConnectionPool pool = new ConnectionPool();

        while (true){
            Socket socket = welcomeSocket.accept(); //Accepts client connection
            System.out.println("Client connected!");

            //Add ServerSocket handler to the pool of handlers
            ServerSocketHandler handler = new ServerSocketHandler(socket, pool);
            pool.addHandler(handler);

            //spawn new thread with socket instance
            new Thread(handler).start();
        }
    }
}
