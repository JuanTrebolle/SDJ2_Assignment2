package Networking.client;

import java.io.IOException;

public class RunClient {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        EchoClient ec = new EchoClient();
        ec.start();
    }
}
