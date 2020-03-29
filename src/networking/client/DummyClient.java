package networking.client;

import model.User;
import networking.shared.EventType;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.List;

public class DummyClient implements Client{
    private List<User> users = new ArrayList<>();
    private PropertyChangeSupport property;

    public DummyClient() {
        property = new PropertyChangeSupport(this);
        users.add(new User("Troels", "troels123"));
        users.add(new User("FakeBlonde", "fb123"));
    }

    @Override
    public void messageReceived(String message) {

    }

    @Override
    public void sendMessage(String message) {

    }

    @Override
    public void login(User user) {
        System.out.println("Client: " + user);
        String result = "";
        boolean userFound = false;
        for (User u : users) {
            if (u.getUserName().equals(user.getUserName())) {
                if (u.getPassword().equals(user.getPassword())){
                    result = "OK";
                } else {
                    result = "Incorrect password";
                }
                userFound = true;
            }
        }
        if (!userFound){
            result = "User not found";
        }
        property.firePropertyChange(EventType.LOGIN_RESULT.toString(), null, result);
    }

    @Override
    public void addListener(String name, PropertyChangeListener listener) {
        if (name == null) {
            property.addPropertyChangeListener(listener);
        } else {
            property.addPropertyChangeListener(name, listener);
        }
    }

    @Override
    public void removeListener(String name, PropertyChangeListener listener) {
        if (name == null) {
            property.removePropertyChangeListener(listener);
        } else {
            property.removePropertyChangeListener(name, listener);
        }
    }
}
