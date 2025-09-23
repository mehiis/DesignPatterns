package org.example.Creational.AbstractFactory.Factories;

import org.example.Creational.AbstractFactory.Buttons.ButtonB;
import org.example.Creational.AbstractFactory.Checkboxes.CheckboxB;
import org.example.Creational.AbstractFactory.TextFields.TextFieldB;
import org.example.Creational.AbstractFactory.UIFactory;

public class FactoryB  extends UIFactory {
    public FactoryB() {
        this.createButton("ButtonB");
        this.createTextField("TextFieldB");
        this.createCheckbox("CheckboxB");
    }

    @Override
    protected void createButton(String text) {
        button = new ButtonB();
    }

    @Override
    protected void createTextField(String text) {
        textField = new TextFieldB();
    }

    @Override
    protected void createCheckbox(String text) {
        checkbox = new CheckboxB();
    }

}
