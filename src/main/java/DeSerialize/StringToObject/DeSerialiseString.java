package DeSerialize.StringToObject;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import utilities.jsonPOJO;

public class DeSerialiseString {
    public static void main(String[] args) throws JsonProcessingException {
     //   String json = "{\"brand\":\"Abc\",\"model\":\"XYZ\"}";
        String json = "{\"brand\":\"Abc\",\"model\":\"XYZ\"}";
        ObjectMapper mapper = new ObjectMapper();
        try {
            jsonPOJO object = mapper.readValue(json, jsonPOJO.class);
            System.out.println(object);
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
}
