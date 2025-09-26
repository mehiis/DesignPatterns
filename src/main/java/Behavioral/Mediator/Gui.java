package Behavioral.Mediator;

import javafx.application.Application;
import javafx.stage.Stage;

public class Gui extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        openConnection();
    }

    public void openConnection(){
        //Create single mediator item
        ChatMediator mediator = new ChatMediator();

        for (int i = 0; i < 3; i++){
            new ChatClient(i, mediator);
        }
    }

}
