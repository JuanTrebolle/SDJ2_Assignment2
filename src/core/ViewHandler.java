package core;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import view.chatView.ChatViewController;
import view.userView.UserViewController;

import java.io.IOException;

public class ViewHandler
{
  private Stage stage;
  private ViewModelFactory viewModelFactory;

  public ViewHandler(ViewModelFactory viewModelFactory)
  {
    this.viewModelFactory = viewModelFactory;
  }

  public void start() throws IOException
  {
    openView("chat");
  }

  private void openView(String viewToOpen) throws IOException
  {
    Scene scene = null;
    FXMLLoader loader = new FXMLLoader();
    Parent root = null;

    //loading the fxml, and opening the views without having to write View.fxml
    loader.setLocation(getClass().getResource("../View/" + viewToOpen + "View.fxml"));
    root = loader.load();
    if("chat".equals(viewToOpen)){
      ChatViewController view = loader.getController();
      view.init(this,viewModelFactory.getChatViewModel());
      stage.setTitle("ChatWindow");
      scene = new Scene(root);
      stage.setScene(scene);
      stage.show();
    }

  }

}
