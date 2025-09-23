package Creational.AbstractFactory.Factories;

import Creational.AbstractFactory.Buttons.ButtonA;
import Creational.AbstractFactory.Checkboxes.CheckboxA;
import Creational.AbstractFactory.TextFields.TextFieldA;
import Creational.AbstractFactory.UIFactory;

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
