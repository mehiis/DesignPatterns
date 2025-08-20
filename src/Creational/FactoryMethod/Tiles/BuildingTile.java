package Creational.FactoryMethod.Tiles;

import Creational.FactoryMethod.Tile;

public class BuildingTile implements Tile {
    @Override
    public String getCharacter() {
        return "B";
    }

    @Override
    public String getType() {
        return "Building";
    }
}
