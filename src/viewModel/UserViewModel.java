package viewModel;

import model.ChatModel;
import model.UserListModel;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class UserViewModel implements PropertyChangeListener
{
  private UserListModel userListModel;

  private ChatModel chatModel;

  public UserViewModel(UserListModel userModel)
  {

  }

  @Override public void propertyChange(PropertyChangeEvent evt)
  {
    //TODO Listen to the UserListModel interface
  }
}
