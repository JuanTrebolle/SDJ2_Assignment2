package view.loginview;

import core.ViewHandler;
import core.ViewModelFactory;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import networking.client.SocketClient;
import viewmodel.LogInViewModel;

import java.awt.*;
import java.io.IOException;
import java.net.Socket;

public class logInController
{
  @FXML private javafx.scene.control.Label loginResultLabel;
  @FXML private javafx.scene.control.TextField usernameTextField;
  @FXML private javafx.scene.control.TextField passwordTextField;

  private ViewHandler viewHandler;
  protected LogInViewModel logInViewModel;
  //private SocketClient client = new SocketClient(this);

  public logInController() throws IOException
  {
  }

  public void init(LogInViewModel logInViewModel)
  {
    this.logInViewModel = logInViewModel;
    this.viewHandler = viewHandler;
    usernameTextField.textProperty().bindBidirectional(logInViewModel.usernameProperty());
    passwordTextField.textProperty().bindBidirectional(logInViewModel.passwordProperty());
    loginResultLabel.textProperty().bindBidirectional(logInViewModel.loginResponseProperty());
    logInViewModel.loginResponseProperty().addListener((observableValue, s, t1) -> onLoginResult(t1));
  }

  private void onLoginResult(String t1) {
    if ("OK".equals(t1)){
      System.out.println("Swap to chat view");
    }
  }

  public void onRegisterButton(ActionEvent actionEvent)
  {
    System.out.println("Register pressed");
  }

  public void onLogInButton(ActionEvent actionEvent)
  {
   logInViewModel.login();
  }
}
