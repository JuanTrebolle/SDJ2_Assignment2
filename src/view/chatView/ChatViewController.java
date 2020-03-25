package view.chatView;

import core.ViewHandler;
import core.ViewModelFactory;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import networking.client.EchoClient;
import view.ViewController;
import viewModel.ChatViewModel;

import javax.swing.plaf.synth.Region;

public class ChatViewController implements ViewController
{
  @FXML private Button buttonSend;
  @FXML private TextArea idOutputMessage;
  @FXML private TextField idInputMessage;

  private ChatViewModel chatViewModel;
  private ViewHandler viewHandler;
  private Region root;


  public void init(ViewHandler viewHandler, ViewModelFactory viewModelFactory)
  {
    this.viewHandler = viewHandler;
    this.chatViewModel = viewModelFactory.getChatViewModel();
    idInputMessage.textProperty().bind(chatViewModel.getUserMessage());
    idOutputMessage.textProperty().bind(chatViewModel.getPoolMessages());
  }

  public void OnSendMessage(ActionEvent actionEvent)
  {

  }

  public void OnLogOut(ActionEvent actionEvent)
  {
    System.exit(0);
  }

  public void OnUsers(ActionEvent actionEvent)
  {
    viewHandler.openUserView();
  }
}
