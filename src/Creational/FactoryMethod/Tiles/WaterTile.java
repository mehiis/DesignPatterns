package Creational.FactoryMethod.Tiles;

import Creational.FactoryMethod.Tile;

public class WaterTile implements Tile {
    @Override
    public String getCharacter() {
        return "W";
    }

    @Override
    public String getType() {
        return "Water";
    }
}
