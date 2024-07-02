package JsonNodePractise;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.xml.internal.ws.addressing.WsaActionUtil;

public class ExtractSourceCountry {
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

        ObjectMapper mapper = new ObjectMapper();
        try{
            JsonNode root = mapper.readTree(jsonResponse);
           JsonNode courseArray = root.get("courseAlloted"); // Can use get or path method
           for(JsonNode course: courseArray){
               if(course.path("SourceCountry").asText().equals("Dollar")){
                   String courseName = course.path("courseName").asText();
                   System.out.println(courseName);
               }
           }

        } catch (JsonMappingException e) {
            throw new RuntimeException(e);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
