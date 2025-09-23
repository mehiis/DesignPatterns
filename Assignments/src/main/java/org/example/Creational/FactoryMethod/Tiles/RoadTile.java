package org.example.Creational.FactoryMethod.Tiles;

import org.example.Creational.FactoryMethod.Tile;

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
