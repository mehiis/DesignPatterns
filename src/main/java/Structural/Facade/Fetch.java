package Structural.Facade;

import java.net.MalformedURLException;
import java.net.URL;

public class Fetch implements Facade {
    @Override
    public String getAttributeValueFromJson(String urlString, String attributeName) throws IllegalArgumentException, MalformedURLException {
        ApiClient apiClient = new ApiClient();

        try {
            String answer = apiClient.getAnswer(new URL(urlString));
            return apiClient.extractAnswerFromJson(answer, attributeName);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
