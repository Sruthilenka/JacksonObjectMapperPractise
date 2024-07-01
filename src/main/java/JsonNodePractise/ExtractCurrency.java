package JsonNodePractise;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ExtractCurrency {
    public static void main(String[] args) {
        String jsonResponse = "{\n" +
                "    \"id\": \"TestingInterview\",\n" +
                "    \"status\": \"allotmentInitiated\",\n" +
                "    \"courseAlloted\": [\n" +
                "        {\n" +
                "            \"id\": \"Coding\",\n" +
                "            \"courseName\": \"JAVA\",\n" +
                "            \"Price\": 100,\n" +
                "            \"SourceCountry\": \"IN\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": \"Coding\",\n" +
                "            \"courseName\": \"PYTHON\",\n" +
                "            \"Price\": 100,\n" +
                "            \"SourceCountry\": \"Dollar\"\n" +
                "        }\n" +
                "    ],\n" +
                "    \"country\": [\n" +
                "        {\n" +
                "            \"locale\": \"IN\",\n" +
                "            \"details\": [\n" +
                "                {\n" +
                "                    \"currency\": \"INR\"\n" +
                "                }\n" +
                "            ]\n" +
                "        },\n" +
                "        {\n" +
                "            \"locale\": \"US\",\n" +
                "            \"details\": [\n" +
                "                {\n" +
                "                    \"currency\": \"Dollar\"\n" +
                "                }\n" +
                "            ]\n" +
                "        }\n" +
                "    ]\n" +
                "}";

        ObjectMapper mapper =new ObjectMapper();
        try{
            JsonNode root = mapper.readTree(jsonResponse);
           //Extract Country Array
            JsonNode countryArray = root.path("country"); // When inside country u have few more arrays, use for each loop
            for(JsonNode country:countryArray){
                if(country.path("locale").asText().equals("IN")){
                    JsonNode details = country.path("details").get(0); //assuming there is only element in details array else if it has array again, then go for for each loop
                    String currency = details.path("currency").asText();
                    System.out.println(currency);
                }
            }
        } catch (JsonMappingException e) {
            throw new RuntimeException(e);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

    }
}
