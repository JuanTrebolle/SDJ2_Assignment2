package model;

import utility.PropertyChangeSubject;

import java.beans.PropertyChangeListener;
import java.util.ArrayList;

public interface Model extends PropertyChangeSubject, PropertyChangeListener {
    String getUserName(String userName);
    String getMessage();
    String toString();
    void setUserName(String name);
    void setMessage(String message);
    void addUser(User user);
    void removeUser(User user);
    ArrayList<User> getUserList();
}
