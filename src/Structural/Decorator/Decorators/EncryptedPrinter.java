package Structural.Decorator.Decorators;

import Structural.Decorator.Printer;
import java.util.Base64;

public class EncryptedPrinter extends BaseDecorator {

    public EncryptedPrinter(Printer printer) {
        super(printer);
    }

    @Override
    public void print(String message) {
        StringBuilder enrypted = new StringBuilder(Base64.getEncoder().encodeToString(message.getBytes()));
        StringBuilder decrypted = new StringBuilder(new String(Base64.getDecoder().decode(enrypted.toString())));

        super.print(enrypted.toString());
    }



}
