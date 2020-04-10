package viewmodel;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import model.Model;

public class LogInViewModel
{
  private Model userModel;
  private StringProperty username;

  public LogInViewModel(Model userModel)
  {
    this.userModel = userModel;
    this.username = new SimpleStringProperty();
  }

  public StringProperty usernameProperty() {
    return this.username;
  }

  public void login() {
    this.userModel.setUserName(this.username.getValue());
    System.out.println(this.username.get());
  }
}
