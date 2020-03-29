package viewmodel;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import model.Model;
import networking.shared.EventType;

import java.beans.PropertyChangeEvent;

public class LogInViewModel
{
  private Model userModel;
  private StringProperty username, password, loginResponse;

  public LogInViewModel(Model userModel)
  {
    this.userModel = userModel;
    username = new SimpleStringProperty();
    password = new SimpleStringProperty();
    loginResponse = new SimpleStringProperty();
    userModel.addListener(EventType.LOGIN_RESULT.toString(), this::onLoginResponse);
  }

  private void onLoginResponse(PropertyChangeEvent event) {
    String result = (String) event.getNewValue();
    loginResponse.set(result);
    System.out.println("VM, response: " + loginResponse.get());
  }

  public StringProperty usernameProperty() {
    return username;
  }

  public StringProperty passwordProperty() {
    return password;
  }

  public void login() {
    System.out.println(username.get());
    System.out.println(password.get());
    userModel.login(username.get(), password.get());
  }

  public StringProperty loginResponseProperty() {
    return loginResponse;
  }
}
