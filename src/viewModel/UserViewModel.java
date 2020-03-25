package viewModel;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import model.ChatModel;
import model.User;
import model.UserListModel;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.List;

public class UserViewModel implements PropertyChangeListener
{
  private UserListModel userListModel;
  private ObservableList<User> users;
  private ChatModel chatModel;

  public UserViewModel(UserListModel userModel)
  {

  }

  public void loadUsers(){
    List<User> nameList = userListModel.getUserList();
    users = FXCollections.observableArrayList(nameList);
  }
  
  @Override public void propertyChange(PropertyChangeEvent evt)
  {
    //TODO Listen to the UserListModel interface
  }

  public ObservableList<User> getUsers()
  {
    return users;
  }
}
