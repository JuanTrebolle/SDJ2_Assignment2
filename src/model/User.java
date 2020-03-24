package model;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class User implements ChatModel
{
  private String userName;
  private String message;
  private PropertyChangeSupport property;

  public User()
  {
    this.property = new PropertyChangeSupport(this);
  }

  @Override public String getUserName()
  {
    return userName;
  }

  @Override public String getMessage()
  {
    property.firePropertyChange("NewMessage", null, this.message);
    return message;
  }

  @Override public void setMessage(String message){
    this.message = message;
  }

  @Override public String toString(){
    return userName + ": " + message;
  }

  @Override public void setUserName(String userName)
  {
    this.userName = userName;
  }

  @Override public void addListener(String name, PropertyChangeListener listener)
  {
    property.addPropertyChangeListener(listener);
  }

  @Override public void removeListener(String name, PropertyChangeListener listener)
  {
    property.removePropertyChangeListener(listener);
  }
}
