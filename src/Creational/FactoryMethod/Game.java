package Creational.FactoryMethod;

import Creational.FactoryMethod.Maps.CityMap;
import Creational.FactoryMethod.Maps.WildernessMap;

import java.util.ArrayList;

public class Game {
    public static void main(String[] args) {
        Game game = new Game();
        game.CreateMap();
    }

    public void CreateMap() {
        Map map = new CityMap();
        int mapGridSize = 5;

        for(int x = 0; x < mapGridSize; x++) {
            map.tiles.add(new ArrayList<>());

            for(int y = 0; y < mapGridSize; y++) {
                map.tiles.get(x).add(map.createTile());
            }
        }

        map.display();
    }
}
