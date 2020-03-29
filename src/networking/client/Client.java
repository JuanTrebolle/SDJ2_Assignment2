package networking.client;

import model.User;
import utility.PropertyChangeSubject;

import java.io.IOException;

public interface Client extends PropertyChangeSubject {
//    void start() throws IOException, ClassNotFoundException;
    void messageReceived(String message);
    void sendMessage(String message);
    void login(User user);
}
