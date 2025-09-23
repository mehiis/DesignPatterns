package org.example.Creational.AbstractFactory.Checkboxes;

import org.example.Creational.AbstractFactory.Checkbox;

public class CheckboxB extends Checkbox {
    @Override
    protected void display() {
        if(value == true) {
            System.out.print("  ☑ I agree to terms");
        } else {
            System.out.print("  ☐ I agree to terms");
        }
    }
}
