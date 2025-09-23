package org.example.Creational.AbstractFactory.TextFields;

import org.example.Creational.AbstractFactory.TextField;

public class TextFieldA extends TextField {
    @Override
    protected void display() {
        System.out.println("+----------------------+");
        System.out.println("|  "+ content + "     |");
        System.out.println("+----------------------+");

        System.out.println("");
    }
}
