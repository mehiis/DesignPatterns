package Behavioral.Command.Commands;

import Behavioral.Command.UI.PixelCanvas;

public class GenerateCodeCommand implements ICommand {
    private PixelCanvas pc;

    public GenerateCodeCommand(PixelCanvas pc) {
        this.pc = pc;
    }

    @Override
    public void execute() {
        pc.generateCode();
    }
}
