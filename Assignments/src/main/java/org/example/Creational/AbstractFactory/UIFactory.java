package org.example.Creational.AbstractFactory;

public abstract class UIFactory {
    protected TextField textField;
    protected Button button;
    protected Checkbox checkbox;

    protected abstract void createButton(String text);
    protected abstract void createTextField(String text);
    protected abstract void createCheckbox(String text);

    protected void display(){
        textField.display();
        button.display();
        checkbox.display();
    }

}
