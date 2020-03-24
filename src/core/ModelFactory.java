package core;

import model.User;
import model.UserList;

public class ModelFactory
{
  private User user;
  private UserList userList;

  public ModelFactory(User user, UserList userList)
  {
    this.user = user;
    this.userList = userList;
  }
}
