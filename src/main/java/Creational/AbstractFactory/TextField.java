package Creational.AbstractFactory;

public abstract class TextField {
    protected String content;

    protected void setText(String text) {
        this.content = text;
    }

    protected abstract void display();
}
