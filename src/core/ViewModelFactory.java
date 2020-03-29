package core;

import viewmodel.ChatViewModel;
import viewmodel.LogInViewModel;
import viewmodel.UserLogViewModel;

public class ViewModelFactory
{
  private ChatViewModel chatViewModel;
  private UserLogViewModel userViewModel;
  private LogInViewModel logInViewModel;
  private ModelFactory modelFactory;

  public ViewModelFactory(ModelFactory modelFactory)
  {
    this.modelFactory = modelFactory;
  }

  public ChatViewModel getChatViewModel()
  {
    if (chatViewModel == null)
    {
      chatViewModel = new ChatViewModel(modelFactory.getModel());
    }
    return chatViewModel;
  }

  public UserLogViewModel getUserViewModel()
  {
    if (userViewModel == null)
    {
      userViewModel = new UserLogViewModel(modelFactory.getModel());
    }
    return userViewModel;
  }

  public LogInViewModel getLogInViewModel()
  {
    if (logInViewModel == null)
    {
      logInViewModel = new LogInViewModel(modelFactory.getModel());
    }
    return logInViewModel;
  }
}
