package Behavioral.Command.Commands;

import Behavioral.Command.UI.PixelCanvas;

public class MoveCursorUpCommand implements ICommand{
    private PixelCanvas pc;

    public MoveCursorUpCommand(PixelCanvas pixelEditor) {
        this.pc = pixelEditor;
    }

    @Override
    public void execute() {
        pc.updateCursorLocation(0,-1);
    }
}
