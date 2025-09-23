package Structural.Flyweight;

import Creational.FactoryMethod.Map;
import Creational.FactoryMethod.Maps.*;
import Creational.FactoryMethod.Tile;
import Creational.FactoryMethod.TileType;

import java.util.ArrayList;
import java.util.List;

public class TileController {
    private final List<List<Tile>> tiles;
    private final Map MAP_TYPE = new CityMap();
    private final int TILE_SIZE = 64;
    private final int MAP_SIZE = 10;

    public TileController() {
        tiles = createTiles();

        //loop through tiles and print them
        for(int x = 0; x < tiles.size(); x++){
            System.out.println("");
            for(int y = 0; y < tiles.get(x).size(); y++){
                System.out.print(tiles.get(x).get(y).getCharacter() + "  ");
            }
        }
    }

    private List<List<Tile>> createTiles(){
        List<List<Tile>> generatedTiles = new ArrayList<>();

        for(int x = 0; x < getMapSize(); x++) {
            generatedTiles.add(new ArrayList<>());

            for(int y = 0; y < getMapSize(); y++) {
                generatedTiles.get(x).add(getMapType().createTile());
            }
        }

        return generatedTiles;
    }

    public int getTileSize(){
        return TILE_SIZE;
    }

    public int getCanvasWidth(){
        return MAP_SIZE * TILE_SIZE;
    }

    public int getCanvasHeight(){
        return MAP_SIZE * TILE_SIZE;
    }

    public List<List<TileType>> getTiles(){
        List<List<TileType>> tileTypes = new ArrayList<>();

        for(int x = 0; x < tiles.size(); x++){
            List<TileType> row = new ArrayList<>();

            for(int y = 0; y < tiles.get(x).size(); y++){
                row.add(tiles.get(x).get(y).getTileType());
            }

            tileTypes.add(row);
        }

        return tileTypes;
    }

    public Map getMapType(){
        return MAP_TYPE;
    }

    public int getMapSize(){
        return MAP_SIZE;
    }


}
