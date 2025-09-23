package org.example.Creational.FactoryMethod.Tiles;

import org.example.Creational.FactoryMethod.Tile;

public class ForestTile implements Tile {
    @Override
    public String getCharacter() {
        return "F";
    }

    @Override
    public String getType() {
        return "Forest";
    }
}
