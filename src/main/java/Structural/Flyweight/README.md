# Assignment 17: Flyweight design pattern

This assignment is a continuation of the [Factory Method design pattern assignment](https://github.com/mehiis/DesignPatterns/tree/c8313e094c299860b2999e2f3ceb893f9d39ce08/src/main/java/Creational/FactoryMethod). 
In this assignment, the tiles created in the previous task are visualized using **JavaFX**, and sprites are implemented with the **Flyweight design pattern**.

- `Flyweight`: An interface for the TileImage class with the `getImage()` method.
- `TileImage`: A concrete implementation of the `Flyweight` interface, representing a single tile image.
- `TileImageFactory`: Creates `TileImage` instances as needed and stores already created tiles in a `Map` to reuse them **(Flyweight pattern)**.
- `TileController`: Works with the **Factory Method pattern** from Assignment 1 and generates a list of tiles.
- `Gui`: Sets up **JavaFX** and provides the `createMap()` method to visualize the tile images on the screen.

<br>Assignment: https://github.com/vesavvo/design_patterns/blob/6e1bbebcd52426f706901f04f986af35234a1fa6/markdown/assignments/flyweight.md
<br>Used for guidance: https://github.com/vesavvo/design_patterns/tree/6e1bbebcd52426f706901f04f986af35234a1fa6/src/main/java/flyweight/birch_trees


