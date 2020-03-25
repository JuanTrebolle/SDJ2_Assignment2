package view.userView;

import core.ViewHandler;
import core.ViewModelFactory;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import view.ViewController;
import viewModel.ChatViewModel;
import viewModel.UserViewModel;

import javax.swing.plaf.synth.Region;
import java.io.IOException;

public class UserViewController implements ViewController
{

  @FXML private TableView tableView;
  @FXML private  TableColumn inputColumn;
  @FXML private  TextField inputAddUser;



  private UserViewModel userViewModel;
  private ViewHandler viewHandler;
  private Region root;

  @Override public void init(ViewHandler viewHandler,
      ViewModelFactory viewModelFactory)
  {
    this.viewHandler = viewHandler;
    this.userViewModel = viewModelFactory.getUserViewModel();

  }


  public void onBackButton(ActionEvent actionEvent) throws IOException
  {
   viewHandler.openChatView();
  }

  public void onAddUser(ActionEvent actionEvent)
  {

  }

}
