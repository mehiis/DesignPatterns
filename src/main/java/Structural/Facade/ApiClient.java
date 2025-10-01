//CODE BASE ON EXAMPLE FROM: https://github.com/vesavvo/design_patterns/blob/6e1bbebcd52426f706901f04f986af35234a1fa6/markdown/assignments/facade.md
package Structural.Facade;

import java.net.HttpURLConnection;
import java.net.URL;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ApiClient {
    public String getAnswer(URL apiUrl) throws Exception {
        return getJsonFromApi(apiUrl);
    }

    private String getJsonFromApi(URL apiUrl) throws Exception {
        HttpURLConnection con = (HttpURLConnection) apiUrl.openConnection();
        con.setRequestMethod("GET");

        try (BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()))) {
            String inputLine;
            StringBuilder content = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            return content.toString();
        } finally {
            con.disconnect();
        }
    }

    public String extractAnswerFromJson(String json, String attributeName) throws Exception {
        JSONParser parser = new JSONParser();

        Object parsedObject = parser.parse(json);

        if (parsedObject instanceof JSONObject jsonObject) {
            Object result = findAttributeRecursively(jsonObject, attributeName);

            //if no valid result found
            if (result == null) {
                throw new IllegalArgumentException("Attribute '" + attributeName + "' not found in JSON.");
            }

            return result.toString();
        } else {
            throw new RuntimeException("Provided Json is not a valid object.");
        }
    }

    private Object findAttributeRecursively(JSONObject jsonObject, String attributeName) {
        if (jsonObject.containsKey(attributeName)) {
            return jsonObject.get(attributeName);
        }

        for (Object key : jsonObject.keySet()) {
            Object value = jsonObject.get(key);

            if (value instanceof JSONObject) {
                Object nestedResult = findAttributeRecursively((JSONObject) value, attributeName);
                if (nestedResult != null) {
                    return nestedResult;
                }
            }
        }

        return null;
    }

}