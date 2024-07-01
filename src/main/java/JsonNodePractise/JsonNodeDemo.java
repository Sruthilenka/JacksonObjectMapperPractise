package JsonNodePractise;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonNodeDemo {
    public static void main(String[] args) {
        String json = "{ \"color\" : \"Black\", \"type\" : \"FIAT\" }";
        ObjectMapper mapper = new ObjectMapper();
        try {
            JsonNode jNode = mapper.readTree(json);// Can pass file also to the readtree method
            String color = jNode.get("color").asText();
            System.out.println(color);

            String type = jNode.get("type").asText();
            System.out.println(type);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
