package model;

import utility.PropertyChangeSubject;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;

public interface Model extends PropertyChangeSubject {
    String getUserName(String userName);
    //String getMessage(String userName, PropertyChangeEvent event);
    String getMessage(PropertyChangeEvent event);
    void setUserName(String name);
    void setMessage(String message);
    //void addUser(User user, PropertyChangeEvent evt);
    //void removeUser(User user);
    ArrayList<User> getUserList();
    void addUser(PropertyChangeEvent event);
    void removeUser(PropertyChangeEvent event);
}
