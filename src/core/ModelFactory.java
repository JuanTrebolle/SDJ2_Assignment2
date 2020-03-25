package core;

import model.ChatModel;
import model.User;
import model.UserList;
import model.UserListModel;

public class ModelFactory
{
  private ChatModel chatModel;
  private UserListModel userListModel;



  public ChatModel getChatModel()
  {
    if(chatModel == null){
      chatModel = new UserList();
    }
    return chatModel;
  }

  public UserListModel getUserModel()
  {
    if(userListModel == null){
      userListModel = new UserList();
    }
    return userListModel;
  }
}
