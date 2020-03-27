package networking.client;

import utility.PropertyChangeSubject;

import java.io.IOException;

public interface Client{ //extends PropertyChangeSubject {
//    void start() throws IOException, ClassNotFoundException;
    void messageReceived(String message);
    void sendMessage(String message);
}
