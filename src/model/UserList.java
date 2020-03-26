package model;

import networking.client.Client;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;

public class UserList implements Model {
  private ArrayList<User> userList = new ArrayList<>();
  private PropertyChangeSupport property = new PropertyChangeSupport(this);  //Subject part
  private Client client;

  public UserList(Client client){
    this.client = client;
    client.addListener("NewUser", this::addUser);
    client.addListener("Message", this::getMessage);
    client.addListener("RemoveUser", this::removeUser);
  }

  public String getMessage(PropertyChangeEvent event) {
    return client.toString();
  }

  @Override
  public void addUser(PropertyChangeEvent event) {
    property.firePropertyChange(event); //fires property when a user is added
  }

  @Override
  public void removeUser(PropertyChangeEvent event) {
    property.firePropertyChange(event); //fires property when a user is added
  }

  /*@Override public void addUser(User user, PropertyChangeEvent evt){
    userList.add(user);
    property.firePropertyChange("AddUser", null, user); //fires property when a user is added
  }

  @Override public void removeUser(User user){
    userList.remove(user);
    property.firePropertyChange("RemoveUser", null, user);  //fires property when a user is removed
  }*/

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

  /*
  @Override
  public void propertyChange(PropertyChangeEvent evt) {
    addUser((PropertyChangeEvent) evt.getNewValue());
    removeUser((PropertyChangeEvent) evt.getNewValue());
  }*/


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

  /*
  @Override public String getMessage(String userName, PropertyChangeEvent event)
  {
    String result = "";
    for (User user : userList) {
      if (user.getUserName().equals(userName)){
        result = user.getMessage();
      }
    }
    return result;
  }*/

  @Override public void setUserName(String name)
  {

  }

  @Override public void setMessage(String message)
  {

  }
}
