package Creational.FactoryMethod.Tiles;

import Creational.FactoryMethod.Tile;
import Creational.FactoryMethod.TileType;

public class ForestTile implements Tile {
    @Override
    public String getCharacter() {
        return "F";
    }

    @Override
    public String getType() {
        return "Forest";
    }

    @Override
    public TileType getTileType() {
        return TileType.FOREST;
    }
}
