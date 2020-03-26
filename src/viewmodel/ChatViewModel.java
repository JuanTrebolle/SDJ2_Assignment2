package viewmodel;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import model.Model;

import java.beans.PropertyChangeEvent;

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
  //  userModel.addListener("Message", this::getUserMessage);
  }

  public StringProperty getUserMessage(/*PropertyChangeEvent event*/)
  {
     //userMessage.setValue(userModel.getMessage());
    return userMessage;
  }

  /*
  public StringProperty getPoolMessages()
  {
    poolMessages.setValue(getUserMessage() + "\n");
    return poolMessages;
  }
*/
}
