package Behavioral.Command;

import Behavioral.Command.Commands.*;
import Behavioral.Command.UI.PixelCanvas;
import Behavioral.Command.UI.PixelEditor;
import javafx.application.Application;
import javafx.stage.Stage;

public class Gui extends Application {

    @Override
    public void start(Stage stage) {
        PixelCanvas pc = new PixelCanvas();

        ICommand up = new MoveCursorUpCommand(pc);
        ICommand down = new MoveCursorDownCommand(pc);
        ICommand left = new MoveCursorLeftCommand(pc);
        ICommand right = new MoveCursorRightCommand(pc);

        ICommand togglePixel = new TogglePixelCommand(pc);
        ICommand generateCode = new GenerateCodeCommand(pc);

        new PixelEditor(pc, up, down, left, right, togglePixel, generateCode);
    }

}
