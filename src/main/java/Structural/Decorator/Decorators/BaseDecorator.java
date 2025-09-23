package Structural.Decorator.Decorators;

import Structural.Decorator.Printer;

public class BaseDecorator implements Printer {
    private Printer printer;

    public BaseDecorator(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void print(String message) {
        printer.print(message);
    }
}
