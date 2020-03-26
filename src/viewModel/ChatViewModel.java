package viewModel;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import model.Model;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class ChatViewModel //implements PropertyChangeListener
{
  private Model userModel;
  private StringProperty userMessage;
  private StringProperty poolMessages;


  public ChatViewModel(Model userModel)
  {
    this.userModel = userModel;
    this.userMessage = new SimpleStringProperty();
    this.poolMessages = new SimpleStringProperty();
    userModel.addListener("AddUser", this::???);
  }

  /*
  @Override public void propertyChange(PropertyChangeEvent evt)
  {
    //TODO Listen to the ChatModel interface
  }*/

  public StringProperty getUserMessage()
  {
    //userMessage.setValue(userModel.getMessage());
    return userMessage;
  }

  public StringProperty getPoolMessages()
  {
    poolMessages.setValue(getUserMessage() + "\n");
    return poolMessages;
  }

}
