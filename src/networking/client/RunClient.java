package networking.client;

import java.io.IOException;

public class RunClient {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SocketClient ec = new SocketClient();
        ec.start();
    }
}
