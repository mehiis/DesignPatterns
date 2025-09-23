package Creational.FactoryMethod.Tiles;

import Creational.FactoryMethod.Tile;
import Creational.FactoryMethod.TileType;

public class RoadTile implements Tile {
    @Override
    public String getCharacter() {
        return "R";
    }

    @Override
    public String getType() {
        return "Road";
    }

    @Override
    public TileType getTileType() {
        return TileType.ROAD;
    }
}
