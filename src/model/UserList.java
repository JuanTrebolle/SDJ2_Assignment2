package model;

import utility.PropertyChangeSubject;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;

public class UserList implements Model {
  private ArrayList<User> userList;
  private PropertyChangeSupport property;

  public UserList() {
    this.property = new PropertyChangeSupport(this);  //Subject part
  }

  @Override public void addUser(User user){
    userList.add(user);
    property.firePropertyChange("AddUser", null, user); //fires property when a user is added
  }

  @Override public void removeUser(User user){
    userList.remove(user);
    property.firePropertyChange("RemoveUser", null, user);  //fires property when a user is removed
  }

  @Override public ArrayList<User> getUserList()
  {
    return userList;
  }

  @Override public void addListener(String name, PropertyChangeListener listener)
  {
    property.addPropertyChangeListener(name, listener);
  }

  @Override public void removeListener(String name, PropertyChangeListener listener)
  {
    property.removePropertyChangeListener(name, listener);
  }

  @Override
  public void propertyChange(PropertyChangeEvent evt) {
    addUser((User) evt.getNewValue());
  }

  @Override public String getUserName(String userName)
  {
    String result = "";
    for (int i = 0; i < userList.size() ; i++)
    {
      if(userList.get(i).getUserName().equals(userName))
       result = userName;
    }
    return result;
  }

  @Override public String getMessage()
  {
    return null;
  }

  @Override public void setUserName(String name)
  {

  }

  @Override public void setMessage(String message)
  {

  }
}
