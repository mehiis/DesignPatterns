package Behavioral.Command.Commands;

import Behavioral.Command.UI.PixelCanvas;

public class MoveCursorLeftCommand implements ICommand{
    private PixelCanvas pc;

    public MoveCursorLeftCommand(PixelCanvas pixelEditor) {
        this.pc = pixelEditor;
    }

    @Override
    public void execute() {
        pc.updateCursorLocation(-1,0);
    }
}
