package org.example.Creational.FactoryMethod.Tiles;

import org.example.Creational.FactoryMethod.Tile;

public class SwampTile implements Tile {
    @Override
    public String getCharacter() {
        return "S";
    }

    @Override
    public String getType() {
        return "Swamp";
    }
}
