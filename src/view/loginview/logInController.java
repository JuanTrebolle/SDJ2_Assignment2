package view.loginview;

import core.ViewHandler;
import core.ViewModelFactory;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import networking.client.SocketClient;
import viewmodel.LogInViewModel;

import java.awt.*;
import java.io.IOException;
import java.net.Socket;

public class logInController
{
  @FXML public javafx.scene.control.TextField usernameTextField;
  @FXML public javafx.scene.control.TextField passwordTextField;

  private ViewHandler viewHandler;
  protected LogInViewModel logInViewModel;
  //private SocketClient client = new SocketClient(this);

  public logInController() throws IOException
  {
  }

  public void init(ViewHandler viewHandler, ViewModelFactory viewModelFactory)
  {
    this.viewHandler = viewHandler;
    this.logInViewModel = viewModelFactory.getLogInViewModel();
  }

  public void onRegisterButton(ActionEvent actionEvent)
  {
    System.out.println("Register pressed");
  }

  public void onLogInButton(ActionEvent actionEvent)
  {
    System.out.println("Log in  pressed");
  }
}
