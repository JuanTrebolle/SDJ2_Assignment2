package view.chatview;

import core.ViewHandler;
import core.ViewModelFactory;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import view.ViewController;
import viewmodel.ChatViewModel;

public class ChatViewController implements ViewController
{
  @FXML private TextArea idOutputMessage;
  @FXML private TextField idInputMessage;

  private ChatViewModel chatViewModel;
  private ViewHandler viewHandler;



  public void init(ViewHandler viewHandler, ViewModelFactory viewModelFactory)
  {
    this.viewHandler = viewHandler;
    this.chatViewModel = viewModelFactory.getChatViewModel();
  idInputMessage.textProperty().bindBidirectional(chatViewModel.getUserMessage());
  //idOutputMessage.textProperty().bindBidirectional(chatViewModel.getPoolMessages());
  }

  public void OnSendMessage(ActionEvent actionEvent)
  {
    idInputMessage.getText();
    addToChat(idInputMessage.getText());
    idInputMessage.setText("");
  }

  public void addToChat(String msg){
    idOutputMessage.appendText(msg + "\n");
  //  idOutputMessage.textProperty().bindBidirectional(chatViewModel.getPoolMessages());
  }

  public void OnLogOut(ActionEvent actionEvent){
    System.exit(0);
  }

  public void OnUsers(ActionEvent actionEvent){
    viewHandler.openUserView();
  }
}
