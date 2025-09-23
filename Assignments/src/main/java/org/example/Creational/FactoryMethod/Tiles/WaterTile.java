package org.example.Creational.FactoryMethod.Tiles;

import org.example.Creational.FactoryMethod.Tile;

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
