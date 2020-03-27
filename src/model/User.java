package model;

public class User
{
  private String userName;
  private String message;

  public User(String userName, String message)
  {
    this.userName = userName;
    this.message = message;
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
    return userName + ": " + message;
  }

  public void setUserName(String userName){
    this.userName = userName;
  }

  /*
  private String getChatMessage(String propertyName) {
    return "";
  }*/
}
