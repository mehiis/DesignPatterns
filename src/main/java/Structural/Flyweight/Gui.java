package Structural.Flyweight;

import Creational.FactoryMethod.TileType;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.List;

public class Gui extends Application {
   final TileController controller = new TileController();

    @Override
    public void start(Stage stage) throws Exception {
        Scene scene = new Scene(createMap());

        stage.setTitle("Flyweight example");
        stage.setScene(scene);
        stage.show();
    }

    private Pane createMap(){
        Canvas canvas = new Canvas(controller.getCanvasWidth(), controller.getCanvasHeight());
        canvas.getGraphicsContext2D().setFill(Color.BLACK);
        List<List<TileType>> tiles = controller.getTiles();

        for(int row = 0; row < controller.getMapSize(); row++){
            for(int col = 0; col < controller.getMapSize(); col++){
                TileType tileType = tiles.get(row).get(col);
                TileImage tileImage = TileImageFactory.getTileImage(tileType);

                canvas.getGraphicsContext2D().drawImage(tileImage.getImage(), col * controller.getTileSize(), row * controller.getTileSize(), controller.getTileSize(), controller.getTileSize());
            }
        }

        return new Pane(canvas);
    }
}
