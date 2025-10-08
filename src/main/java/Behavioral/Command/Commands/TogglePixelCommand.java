package Behavioral.Command.Commands;

import Behavioral.Command.UI.PixelCanvas;

public class TogglePixelCommand implements ICommand{
    public PixelCanvas pc;

    public TogglePixelCommand(PixelCanvas pc) {
        this.pc = pc;
    }

    @Override
    public void execute() {
        pc.togglePixel(pc.getCurrentCursorLocation()[0], pc.getCurrentCursorLocation()[1]);
    }
}
