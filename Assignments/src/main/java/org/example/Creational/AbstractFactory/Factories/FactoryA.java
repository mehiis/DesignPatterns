package org.example.Creational.AbstractFactory.Factories;

import org.example.Creational.AbstractFactory.Buttons.ButtonA;
import org.example.Creational.AbstractFactory.Checkboxes.CheckboxA;
import org.example.Creational.AbstractFactory.TextFields.TextFieldA;
import org.example.Creational.AbstractFactory.UIFactory;

public class FactoryA extends UIFactory {
    public FactoryA() {
        this.createButton("ButtonA");
        this.createTextField("TextFieldA");
        this.createCheckbox("CheckboxA");
    }

    @Override
    protected void createButton(String text) {
        button = new ButtonA();
    }

    @Override
    protected void createTextField(String text) {
        textField = new TextFieldA();
    }

    @Override
    protected void createCheckbox(String text) {
        checkbox = new CheckboxA();
    }
}
