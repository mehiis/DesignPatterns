package Structural.Facade;

import java.io.IOException;

public interface Facade {
    String getAttributeValueFromJson(String urlString, String attributeName) throws IllegalArgumentException, IOException;
}
