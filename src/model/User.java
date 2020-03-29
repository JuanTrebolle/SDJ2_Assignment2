package model;

import java.io.Serializable;

public class User implements Serializable
{
  private String userName;
  private String password;
  private String message;

  public User(String userName, /*String message,*/ String password)
  {
    this.userName = userName;
    //this.message = message;
    this.password = password;
  }


  public String getUserName(){
    return userName;
  }

  public String getMessage(){
    return message;
  }

  //delete this stuff
  public void setMessage(String message){
    this.message = message;
  }

  public String toString(){
    return "User(" + userName + ", " + password;
  }

  public void setUserName(String userName){
    this.userName = userName;
  }

  public String getPassword() {
    return password;
  }

  /*
  private String getChatMessage(String propertyName) {
    return "";
  }*/
}
