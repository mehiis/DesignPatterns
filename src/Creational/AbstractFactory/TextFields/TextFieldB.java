package Creational.AbstractFactory.TextFields;

import Creational.AbstractFactory.TextField;

public class TextFieldB extends TextField {
    @Override
    protected void display() {
        System.out.println("┌────────────────────┐");
        System.out.println("│  " + content + "   │");
        System.out.println("└────────────────────┘");

        System.out.println("");
    }
}
