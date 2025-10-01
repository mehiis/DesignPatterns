package Structural.Facade;

public class Main {
    public static void main(String[] args){
        Fetch fetch = new Fetch();

        try {
            System.out.println(fetch.getAttributeValueFromJson("https://api.chucknorris.io/jokes/random", "value"));
            System.out.println(fetch.getAttributeValueFromJson("https://api.gameofthronesquotes.xyz/v1/random", "sentence"));
            System.out.println(fetch.getAttributeValueFromJson("https://pokeapi.co/api/v2/pokemon/pikachu", "name"));
            System.out.println(fetch.getAttributeValueFromJson("https://www.freetogame.com/api/game?id=226", "title"));
            System.out.println(fetch.getAttributeValueFromJson("https://v2.jokeapi.dev/joke/Programming?type=single", "joke"));

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
