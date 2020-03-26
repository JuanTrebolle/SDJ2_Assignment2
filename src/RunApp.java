import javafx.application.Application;

/*
 * FINISHED: Merge Model into 1 interface
 * TODO: binding View-ViewModel
 * TODO: Add the user to userlist column
 * TODO: Make sure messages (probably also users) aren’t deleted when you exit specific views. Save messages
 * TODO: Make client interact/chat
 * TODO: Observer patterns finish ???
 * TODO: Clean up code
 * TODO Troels:
 *      - FINISHED toString() in Model interface
 *      - Confusion because of implementing the Listener interface instead of anonymous implementation
 *      - FINISHED Model is set up correctly as Subject
 *      - FINISHED I don't understand UserList::getUserName(), it just returns the argument again?
 *      - FINISHED Rename EchoServer
 *      - FINISHED Rename userView to loginView
 *      - FINISHED name packages with lowercase
 *      - Focus on 1 feature at a time.
 *      - DET MESTE SER UD TIL AT VAERE PA DEN RIGTIGE VEJ!!!
 * */
public class RunApp {
    public static void main(String[] args) {
        Application.launch(ChatApp.class);
    }
}