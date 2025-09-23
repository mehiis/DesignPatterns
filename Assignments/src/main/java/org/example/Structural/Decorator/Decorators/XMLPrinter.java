package org.example.Structural.Decorator.Decorators;

import org.example.Structural.Decorator.Printer;

public class XMLPrinter extends BaseDecorator {

    public XMLPrinter(Printer printer) {
        super(printer);
    }

    @Override
    public void print(String message) {
        super.print("<Message>" + message + "</Message>");
    }

}
