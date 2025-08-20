package Creational.FactoryMethod.Maps;

import Creational.FactoryMethod.Map;
import Creational.FactoryMethod.Tile;
import Creational.FactoryMethod.Tiles.ForestTile;
import Creational.FactoryMethod.Tiles.SwampTile;
import Creational.FactoryMethod.Tiles.WaterTile;

import java.util.Random;

public class WildernessMap extends Map {
   public WildernessMap() {
       System.out.println("Creating Wilderness Map...");
   }

    @Override
    protected Tile createTile() {
        Random rand = new Random();
        int whichTile = rand.nextInt(3);

        switch (whichTile){
            case 0:
                return new ForestTile();
            case 1:
                return new WaterTile();
            case 2:
                return new SwampTile();
            default:
                System.out.println("Random index out of bounds.");
                return null;
        }
    }
}
