package view.userlogview;

import core.ViewHandler;
import core.ViewModelFactory;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import model.User;
import view.ViewController;
import viewmodel.UserLogViewModel;

import javax.swing.plaf.synth.Region;
import java.io.IOException;

public class userLogViewController implements ViewController
{
  @FXML private TableView tableView;
  @FXML private  TableColumn<String, User> nameColumn;
  @FXML private  TextField inputAddUser;

  private UserLogViewModel userViewModel;
  private ViewHandler viewHandler;
  private Region root;


  @Override public void init(ViewHandler viewHandler,
      ViewModelFactory viewModelFactory)
  {
    this.viewHandler = viewHandler;
    this.userViewModel = viewModelFactory.getUserViewModel();
    tableView.setItems(userViewModel.getUsers());
    nameColumn.setCellFactory(new PropertyValueFactory("name"));
  }

  public void onBackButton(ActionEvent actionEvent) throws IOException
  {
   viewHandler.openChatView();
  }

  public void onAddUser(ActionEvent actionEvent)
  {
    inputAddUser.getText();
 //   addUserToColumn();
    inputAddUser.setText("");
  }

  public void addUserToColumn(String username){
    tableView.getItems().add(username);
    nameColumn.setCellValueFactory(new PropertyValueFactory<>("users"));
  }



}