package DeSerialize.StringToObject;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import utilities.Laptop;

public class DeSerialiseString {
    public static void main(String[] args) throws JsonProcessingException {
        String json = "{\"brand\":\"Abc\",\"model\":\"XYZ\"}";
        ObjectMapper mapper = new ObjectMapper();
        try {
            Laptop object = mapper.readValue(json, Laptop.class);
            System.out.println(object);
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
}
