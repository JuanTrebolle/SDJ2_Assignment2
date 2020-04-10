package networking.client;

import networking.shared.Message;
import utility.PropertyChangeSubject;

public interface Client extends PropertyChangeSubject {
    void messageReceived(String message);
    void sendMessage(Message message);
    String getUsername();
    void setUsername(String username);
}
