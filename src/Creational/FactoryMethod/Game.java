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
        int mapSize = 5;

        for(int x = 0; x < mapSize; x++) {
            map.tiles.add(new ArrayList<>());

            for(int y = 0; y < mapSize; y++) {
                map.tiles.get(x).add(map.createTile());
            }
        }

        map.display();
    }
}
