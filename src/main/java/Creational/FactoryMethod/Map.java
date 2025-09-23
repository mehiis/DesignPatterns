package Creational.FactoryMethod;

import java.util.ArrayList;
import java.util.List;

public abstract class Map {
    protected List<List<Tile>> tiles = new ArrayList<>();

    public abstract Tile createTile();

    protected void display(){
        System.out.println("Displaying Map, grid size: " + tiles.size() * tiles.size() + ".");


        for (List<Tile> tileList : tiles) {
            System.out.println("");

            for (Tile tile : tileList) {
                System.out.print(tile.getCharacter() + "  ");
            }
        }

        System.out.println("");
    }
}