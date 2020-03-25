package model;

import networking.client.Client;


public class User
{
  private String userName = "";
  private String message;

  private Client client;

  public User(){
    setUserName(userName);
  }


  public String getUserName(){
    return userName;
  }

  public String getMessage(){
    return message;
  }

  public void setMessage(String message){
    this.message = message;
  }

  public String toString(){
    return userName + ": " + message;
  }

  public void setUserName(String userName){
    this.userName = userName;
  }

  private String getChatMessage(String propertyName) {
    //TODO Listen to the client interface
    return "";
  }
}
