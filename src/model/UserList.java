package model;

import networking.client.Client;
import networking.shared.EventType;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;

public class UserList implements Model {
  private ArrayList<User> userList = new ArrayList<>();
  private PropertyChangeSupport property = new PropertyChangeSupport(this);  //Subject part
  private Client client;
  private User loggedInUser;


  public UserList(Client client){
    this.client = client;
    client.addListener(EventType.LOGIN_RESULT.toString(), this::onLoginResult);
   /* client.addListener("NewUser", this::addUser);
    client.addListener("Message", this::getMessage);
    client.addListener("RemoveUser", this::removeUser);*/
  }

  private void onLoginResult(PropertyChangeEvent event) {
    String loggedInResult = (String) event.getNewValue();
    System.out.println("Result received in the model: " + loggedInResult);
    if (!"OK".equals(loggedInResult)){
      loggedInUser = null;
    }

    property.firePropertyChange(EventType.LOGIN_RESULT.toString(), null, loggedInResult);
  }

  @Override
  public void login(String username, String password) {
    loggedInUser = new User(username, password);
    client.login(loggedInUser);
  }

  public UserList()
  {

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


  @Override public ArrayList<User> getUserList()
  {
    return userList;
  }


  @Override public String getUserName(String userName)
  {
    String result = "";
    for (int i = 0; i < userList.size() ; i++)
    {
      if(userList.get(i).getUserName().equals(userName))
       result = userList.get(i).getUserName();
    }
    return result;
  }

  @Override public void setUserName(String name)
  {

  }

  @Override public void setMessage(String message)
  {

  }

  @Override
  public void propertyChange(PropertyChangeEvent evt) {

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

  public void addListener(PropertyChangeListener listener){
    property.addPropertyChangeListener(listener);
  }

  public void removeListener(PropertyChangeListener listener){
    property.removePropertyChangeListener(listener);
  }
}
