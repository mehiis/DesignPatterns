package org.example.Creational.AbstractFactory;

import org.example.Creational.AbstractFactory.Factories.FactoryB;

public class Main {
    public static void main(String[] args) {
        //UIFactory factory =  new FactoryA();
        UIFactory factory = new FactoryB();

        factory.textField.setText("Enter Text Here");
        factory.button.setText("Click");
        factory.checkbox.setValue(true);

        factory.display();
    }

}
