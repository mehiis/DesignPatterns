package Creational.AbstractFactory.Factories;

import Creational.AbstractFactory.Buttons.ButtonB;
import Creational.AbstractFactory.Checkboxes.CheckboxB;
import Creational.AbstractFactory.TextFields.TextFieldB;
import Creational.AbstractFactory.UIFactory;

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
