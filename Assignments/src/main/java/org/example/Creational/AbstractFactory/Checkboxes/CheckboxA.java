package org.example.Creational.AbstractFactory.Checkboxes;

import org.example.Creational.AbstractFactory.Checkbox;

public class CheckboxA extends Checkbox {
    @Override
    protected void display() {
        if(value == true) {
            System.out.print("   [x] Accept Terms");
        } else {
            System.out.print("   [] Accept Terms");
        }
    }
}
