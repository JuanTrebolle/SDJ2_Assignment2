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
  private Scene chatScene;
  private Stage stage;
  private ViewModelFactory viewModelFactory;

  public ViewHandler(ViewModelFactory viewModelFactory)
  {
    this.viewModelFactory = viewModelFactory;
  }

  public void start() throws IOException
  {
    stage = new Stage();
    openChatView("chat");
  }

  private void openChatView(String viewToOpen) throws IOException
  {
    if (chatScene == null) {
      Parent root = loadFXML("../view/chatView/chatView.fxml");
      stage.setTitle("ChatWindow");
      chatScene = new Scene(root);
      stage.setScene(chatScene);
      stage.show();
    }
  }

  public void openUserView() {
    // no reusing a userListScene, because I want the userList to reload the latest every time.
    Parent root = loadFXML("../view/userView/userView.fxml");
    Scene userListScene = new Scene(root);
    stage.setTitle("UserListWindow");
    stage.setScene(userListScene);
    stage.show();
  }

  private Parent loadFXML(String path){
    FXMLLoader loader = new FXMLLoader();
    loader.setLocation(getClass().getResource(path));
    Parent root = null;
    try {
      root = loader.load();
    } catch (IOException e) {
      e.printStackTrace();
    }

    ChatViewController controller = loader.getController();
    controller.init(this, viewModelFactory);
    return root;
  }
}
