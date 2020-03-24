package view.chatView;

import core.ViewHandler;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import networking.client.EchoClient;
import viewModel.ChatViewModel;

import javax.swing.plaf.synth.Region;

public class ChatViewController
{
  @FXML private Button buttonSend;
  @FXML private TextArea idOutputMessage;
  @FXML private TextField idInputMessage;

  private ChatViewModel chatViewModel;
  private ViewHandler viewHandler;
  private Region root;


  public void init(ViewHandler viewHandler, Object mainViewModel)
  {
    this.viewHandler = viewHandler;
    this.chatViewModel = chatViewModel;
    idInputMessage.textProperty().bind(chatViewModel.getUserMessage());
    idOutputMessage.textProperty().bind(chatViewModel.getPoolMessages());
  }

  public ChatViewController()
  {
  }

  public void OnSendMessage(ActionEvent actionEvent)
  {

  }

  public void OnLogOut(ActionEvent actionEvent)
  {
  }

  public void OnUsers(ActionEvent actionEvent)
  {

  }
}
