package viewModel;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.value.ObservableValue;
import model.ChatModel;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class ChatViewModel implements PropertyChangeListener
{
  private ChatModel chatModel;
  private StringProperty userMessage;
  private StringProperty poolMessages;


  public ChatViewModel(ChatModel chatModel)
  {
    this.userMessage = new SimpleStringProperty();
    this.poolMessages = new SimpleStringProperty();
  }

  @Override public void propertyChange(PropertyChangeEvent evt)
  {
    //TODO Listen to the ChatModel interface
  }

  public StringProperty getUserMessage()
  {
    return userMessage;
  }

  public StringProperty getPoolMessages()
  {
    return poolMessages;
  }
}
