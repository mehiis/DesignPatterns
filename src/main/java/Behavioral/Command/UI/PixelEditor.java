package Behavioral.Command.UI;

import Behavioral.Command.Commands.ICommand;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;

public class PixelEditor {
    public PixelEditor(PixelCanvas pc, ICommand upCommand, ICommand downCommand, ICommand leftCommand, ICommand rightCommand, ICommand togglePixelCommand, ICommand generateCodeCommand) {
        Stage stage = new Stage();
        Scene scene = new Scene(pc.generatePixelCanvas());
        stage.setScene(scene);

        stage.setTitle("Pixel Art Editor - Command Design Pattern");
        stage.setResizable(false);
        stage.setWidth(816);
        stage.setHeight(839);

        scene.setOnKeyPressed(event -> {
            if(event.getCode() == KeyCode.SPACE) {
                togglePixelCommand.execute();
            }

            if(event.getCode() == KeyCode.ENTER) {
                generateCodeCommand.execute();
            }

            if(event.getCode() == KeyCode.W || event.getCode() == KeyCode.UP) {
                upCommand.execute();
            } else if(event.getCode() == KeyCode.S || event.getCode() == KeyCode.DOWN) {
                downCommand.execute();
            } else if(event.getCode() == KeyCode.A || event.getCode() == KeyCode.LEFT) {
                leftCommand.execute();
            } else if(event.getCode() == KeyCode.D || event.getCode() == KeyCode.RIGHT) {
                rightCommand.execute();
            }
        });

        stage.show();
    }
}
