package Behavioral.Command.UI;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class PixelCanvas {
    private int[] currentCursorLocation = new int[2];
    private int[] prevCursorlocation = new int[2];

    //BLANK CANVAS
    private int[][] pixelArt = new int[8][8];

    //EXAMPLE PICTURE
    /*int[][] pixelArt = {
            {0, 0, 1, 1, 1, 1, 0, 0},
            {0, 0, 1, 1, 1, 1, 0, 0},
            {0, 0, 0, 1, 1, 0, 0, 0},
            {0, 1, 1, 1, 1, 1, 1, 0},
            {0, 0, 0, 1, 1, 0, 0, 0},
            {0, 0, 1, 0, 0, 1, 0, 0},
            {0, 1, 0, 0, 0, 0, 1, 0},
            {1, 0, 0, 0, 0, 1, 0, 1}
    };
     */

    private Canvas canvas;

    public Pane generatePixelCanvas() {
        Pane root = new Pane();
        canvas = new Canvas(800, 800);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setLineWidth(4);

        updateArt();

        root.getChildren().add(canvas);
        updateCursorLocation(0,0);
        return root;
    }

    public void updateCursorLocation(int x, int y){
        if(x > 1 || x < -1 || y > 1 || y < -1)
            return;

        int tempX = currentCursorLocation[0] + x;
        int tempY = currentCursorLocation[1] + y;

        if(tempX < 0 || tempX > 7 || tempY < 0 || tempY > 7)
            return;

        prevCursorlocation[0] = currentCursorLocation[0];
        prevCursorlocation[1] = currentCursorLocation[1];

        currentCursorLocation[0] = tempX;
        currentCursorLocation[1] = tempY;

        updateArt();

        GraphicsContext gc = canvas.getGraphicsContext2D();
        double size = 100;

        double col = currentCursorLocation[0] * 100;
        double row = currentCursorLocation[1] * 100;

        gc.setStroke(Color.RED);
        gc.setFill(Color.TRANSPARENT);
        gc.fillRect(col, row, size, size);
        gc.strokeRect(col, row, size, size);

        System.out.println("Cursor moved. Current coordinates are [" + currentCursorLocation[0] + ", " + currentCursorLocation[1] + "].");
    }

    public int[] getCurrentCursorLocation(){
        return currentCursorLocation;
    }

    public void togglePixel(int col, int row) {
        System.out.println();

        if (pixelArt[row][col] == 0) {
            pixelArt[row][col] = 1;
            System.out.println("Toggled pixel @ [" + row + ", " + col + "] to 1.");
        } else {
            pixelArt[row][col] = 0;
            System.out.println("Toggled pixel @ [" + row + ", " + col + "] to 0.");
        }

        updateArt();
    }

    public void updateArt() {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setStroke(Color.BLACK);
        double size = 100;

        for (int i = 0; i < pixelArt.length; i++) {
            for (int j = 0; j < pixelArt[0].length; j++) {
                Color color;
                double x = j * 100;
                double y = i * 100;

                if (pixelArt[i][j] == 0) {
                    color = Color.WHITESMOKE;
                } else {
                    color = Color.BLACK;
                }

                gc.setFill(color);
                gc.fillRect(x, y, size, size);
                gc.strokeRect(x, y, size, size);
            }
        }
    }

    public void generateCode(){
        System.out.println("\nint[][] pixelArt = {");

        for (int i = 0; i < pixelArt.length; i++) {
            System.out.print("    {");
            for (int j = 0; j < pixelArt[i].length; j++) {
                System.out.print(pixelArt[i][j]);
                if (j < pixelArt[i].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.print("}");
            if (i < pixelArt.length - 1) {
                System.out.println(",");
            } else {
                System.out.println();
            }
        }
        System.out.println("};");
    }
}
