package Creational.FactoryMethod.Tiles;

import Creational.FactoryMethod.Tile;
import Creational.FactoryMethod.TileType;

public class SwampTile implements Tile {
    @Override
    public String getCharacter() {
        return "S";
    }

    @Override
    public String getType() {
        return "Swamp";
    }

    @Override
    public TileType getTileType() {
        return TileType.SWAMP;
    }
}
