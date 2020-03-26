package core;

import viewmodel.ChatViewModel;
import viewmodel.LoginViewModel;

public class ViewModelFactory
{
  private ChatViewModel chatViewModel;
  private LoginViewModel userViewModel;
  private ModelFactory modelFactory;

  public ViewModelFactory(ModelFactory modelFactory)
  {
    this.modelFactory = modelFactory;
  }



  public ChatViewModel getChatViewModel()
  {
    if(chatViewModel == null){
      chatViewModel = new ChatViewModel(modelFactory.getModel());
    }
    return chatViewModel;
  }

  public LoginViewModel getUserViewModel()
  {
    if(userViewModel == null){
      userViewModel = new LoginViewModel(modelFactory.getModel());
    }
    return userViewModel;
  }
}
