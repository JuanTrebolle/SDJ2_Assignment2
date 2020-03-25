package core;

import viewModel.ChatViewModel;
import viewModel.UserViewModel;

public class ViewModelFactory
{
  private ChatViewModel chatViewModel;
  private ModelFactory modelFactory;

  public ViewModelFactory(ModelFactory modelFactory)
  {
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
