package Behavioral.Command.Commands;

import Behavioral.Command.UI.PixelCanvas;

public class MoveCursorDownCommand implements ICommand{
    private PixelCanvas pc;

    public MoveCursorDownCommand(PixelCanvas pixelEditor) {
        this.pc = pixelEditor;
    }

    @Override
    public void execute() {
        pc.updateCursorLocation(0,1);
    }
}
