package model;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;

public class UserList implements UserListModel
{
  private ArrayList<User> userList;
  private PropertyChangeSupport property;

  public UserList() {
    this.property = new PropertyChangeSupport(this);
  }


  @Override public void addUser(User user){
    userList.add(user);
    property.firePropertyChange("AddUser", null, user);
  }

  @Override public void removeUser(User user){
    userList.remove(user);
    property.firePropertyChange("RemoveUser", null, user);
  }

  @Override public ArrayList<User> getUserList()
  {
    return userList;
  }

  @Override public void addListener(String name, PropertyChangeListener listener)
  {
    property.addPropertyChangeListener(listener);
  }

  @Override public void removeListener(String name, PropertyChangeListener listener)
  {
    property.removePropertyChangeListener(listener);
  }

  @Override
  public void propertyChange(PropertyChangeEvent evt) {
    //TODO Listen to the client interface
  }
}
