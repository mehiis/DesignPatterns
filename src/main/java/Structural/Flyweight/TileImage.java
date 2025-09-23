package Structural.Flyweight;

import javafx.scene.image.Image;

public class TileImage implements Flyweight {
    private final Image image;

    public TileImage(Image image) {
        this.image = image;
    }

    @Override
    public Image getImage() {
        return this.image;
    }
}
