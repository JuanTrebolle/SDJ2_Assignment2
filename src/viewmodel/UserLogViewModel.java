package viewmodel;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import model.Model;
import model.User;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.List;

public class UserLogViewModel implements PropertyChangeListener
{
  private Model userModel;
  private ObservableList<User> users;

  public UserLogViewModel(Model model)
  {

  }

  public void loadUsers(){
    List<User> nameList = userModel.getUserList();
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
