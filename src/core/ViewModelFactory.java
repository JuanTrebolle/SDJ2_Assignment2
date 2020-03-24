package core;

import viewModel.ChatViewModel;
import viewModel.UserViewModel;

public class ViewModelFactory
{
  private ChatViewModel chatViewModel;
  private UserViewModel userViewModel;
  private ModelFactory modelFactory;

  public ViewModelFactory(ChatViewModel chatViewModel, UserViewModel userViewModel, ModelFactory modelFactory)
  {
    this.chatViewModel = chatViewModel;
    this.userViewModel = userViewModel;
    this.modelFactory = modelFactory;
  }



  public ChatViewModel getChatViewModel()
  {
    if(chatViewModel == null){
      chatViewModel = new ChatViewModel(modelFactory.getChatModel());
    }
    return chatViewModel;
  }
}
