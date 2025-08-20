package Creational.FactoryMethod.Maps;

import Creational.FactoryMethod.Map;
import Creational.FactoryMethod.Tile;
import Creational.FactoryMethod.Tiles.*;

import java.util.Random;

public class CityMap extends Map {
    public CityMap() {
        System.out.println("Creating City Map...");
    }

    @Override
    protected Tile createTile() {
        Random rand = new Random();
        int whichTile = rand.nextInt(3);

        switch (whichTile){
            case 0:
                return new BuildingTile();
            case 1:
                return new RoadTile();
            case 2:
                return new ForestTile();
            default:
                System.out.println("Random index out of bounds.");
                return null;
        }
    }
}
