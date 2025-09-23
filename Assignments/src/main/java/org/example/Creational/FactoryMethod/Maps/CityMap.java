package org.example.Creational.FactoryMethod.Maps;

import org.example.Creational.FactoryMethod.Map;
import org.example.Creational.FactoryMethod.Tile;
import org.example.Creational.FactoryMethod.Tiles.BuildingTile;
import org.example.Creational.FactoryMethod.Tiles.ForestTile;
import org.example.Creational.FactoryMethod.Tiles.RoadTile;

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
