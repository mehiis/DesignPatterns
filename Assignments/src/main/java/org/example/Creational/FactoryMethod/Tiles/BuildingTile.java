package org.example.Creational.FactoryMethod.Tiles;

import org.example.Creational.FactoryMethod.Tile;

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
