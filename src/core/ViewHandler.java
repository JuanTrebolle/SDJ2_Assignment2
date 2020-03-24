package core;

import view.chatView.ChatViewController;
import view.userView.UserViewController;

public class ViewHandler
{
  private ChatViewController chatViewController;
  private UserViewController userViewController;
  private ViewModelFactory viewModelFactory;

  public ViewHandler(ChatViewController chatViewController, UserViewController userViewController, ViewModelFactory viewModelFactory)
  {
    this.chatViewController = chatViewController;
    this.userViewController = userViewController;
    this.viewModelFactory = viewModelFactory;
  }
}
