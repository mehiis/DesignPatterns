package Behavioral.Command.Commands;

import Behavioral.Command.UI.PixelCanvas;

public class MoveCursorRightCommand implements ICommand{
    private PixelCanvas pc;

    public MoveCursorRightCommand(PixelCanvas pixelEditor) {
        this.pc = pixelEditor;
    }

    @Override
    public void execute() {
        pc.updateCursorLocation(1,0);
    }
}
