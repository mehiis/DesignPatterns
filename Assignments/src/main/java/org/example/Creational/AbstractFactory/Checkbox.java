package org.example.Creational.AbstractFactory;

public abstract class Checkbox {
    protected boolean value;

    protected void setValue(boolean value) {
        this.value = value;
    }

    protected abstract void display();
}
