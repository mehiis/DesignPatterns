package org.example.Creational.AbstractFactory.Buttons;

import org.example.Creational.AbstractFactory.Button;

public class ButtonA extends Button {
    @Override
    protected void display() {
        System.out.println("+---------+");
        System.out.println("|  " + content + "  |");
        System.out.print("+---------+");


    }
}
