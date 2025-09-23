package org.example.Creational.AbstractFactory;

public abstract class Button {

    protected String content;

    protected void setText(String text) {
        this.content = text;
    }

    protected abstract void display();
}
