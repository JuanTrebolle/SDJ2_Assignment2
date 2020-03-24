package core;

import model.ChatModel;
import model.User;

public class ModelFactory
{
  public ChatModel chatModel;


  public ChatModel getChatModel()
  {
    if(chatModel == null){
      chatModel = new User();
    }
    return chatModel;
  }
}
