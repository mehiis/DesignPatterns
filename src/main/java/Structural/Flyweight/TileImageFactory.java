package Structural.Flyweight;

import Creational.FactoryMethod.TileType;
import javafx.scene.image.Image;
import java.util.EnumMap;
import java.util.Map;

public class TileImageFactory {
    private static final Map<TileType, TileImage> images = new EnumMap<>(TileType.class);

    public static TileImage getTileImage(TileType tileType){
        TileImage image = images.get(tileType);

        if(image == null){
            switch (tileType){
                case BUILDING:
                    image = new TileImage(new Image("Images/building-tile.png"));
                    break;
                case FOREST:
                    image = new TileImage(new Image("Images/forest-tile.png"));
                    break;
                case ROAD:
                    image = new TileImage(new Image("Images/road-tile.png"));
                    break;
                case SWAMP:
                    image = new TileImage(new Image("Images/swamp-tile.png"));
                    break;
                case WATER:
                    image = new TileImage(new Image("Images/water-tile.png"));
                    break;
                default:
                    throw new IllegalArgumentException("Tile type not found");
            }

            images.put(tileType, image);
        }
        return image;
    }
}
