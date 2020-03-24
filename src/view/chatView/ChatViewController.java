package view.chatView;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import networking.client.EchoClient;

public class ChatViewController
{
  @FXML private Button buttonSend;
  @FXML private TextArea idOutputMessage;
  @FXML private TextField idInputMessage;


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
