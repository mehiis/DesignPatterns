package Creational.FactoryMethod.Tiles;

import Creational.FactoryMethod.Tile;
import Creational.FactoryMethod.TileType;

public class BuildingTile implements Tile {
    @Override
    public String getCharacter() {
        return "B";
    }

    @Override
    public String getType() {
        return "Building";
    }

    @Override
    public TileType getTileType() {
        return TileType.BUILDING;
    }
}
