package Creational.FactoryMethod.Tiles;

import Creational.FactoryMethod.Tile;

public class RoadTile implements Tile {
    @Override
    public String getCharacter() {
        return "R";
    }

    @Override
    public String getType() {
        return "Road";
    }
}
