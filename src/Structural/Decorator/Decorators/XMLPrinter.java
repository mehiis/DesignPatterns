package Structural.Decorator.Decorators;

import Structural.Decorator.Printer;

public class XMLPrinter extends BaseDecorator {

    public XMLPrinter(Printer printer) {
        super(printer);
    }

    @Override
    public void print(String message) {
        super.print("<Message>" + message + "</Message>");
    }

}
