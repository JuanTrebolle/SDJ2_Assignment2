package view.loginview;

import core.ViewHandler;
import core.ViewModelFactory;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import networking.client.SocketClient;
import view.ViewController;
import viewmodel.LogInViewModel;

import java.awt.*;
import java.io.IOException;
import java.net.Socket;

public class logInController implements ViewController
{
  @FXML private javafx.scene.control.Label loginResultLabel;
  @FXML private javafx.scene.control.TextField usernameTextField;
  @FXML private javafx.scene.control.TextField passwordTextField;

  private ViewHandler viewHandler;
  private LogInViewModel logInViewModel;

  public logInController() throws IOException
  {
  }

  public void init(ViewHandler viewHandler, ViewModelFactory viewModelFactory)
  {
    this.logInViewModel = viewModelFactory.getLogInViewModel();
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
