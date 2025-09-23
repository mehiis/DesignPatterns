package Creational.FactoryMethod.Tiles;

import Creational.FactoryMethod.Tile;
import Creational.FactoryMethod.TileType;

public class WaterTile implements Tile {
    @Override
    public String getCharacter() {
        return "W";
    }

    @Override
    public String getType() {
        return "Water";
    }

    @Override
    public TileType getTileType() {
        return TileType.WATER;
    }
}
