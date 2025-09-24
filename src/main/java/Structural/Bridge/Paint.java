//MY CLASS

package Structural.Bridge;

public class Paint implements Workshop {
    private final PaintColors color;

    public Paint(PaintColors color) {
        this.color = color;
    }

    @Override
    public void work() {
        System.out.print("painted in " + color + " color.\n");
    }
}



