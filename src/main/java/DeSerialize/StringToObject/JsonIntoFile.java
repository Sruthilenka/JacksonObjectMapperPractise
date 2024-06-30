package DeSerialize.StringToObject;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import utilities.Laptop;

import java.io.File;
import java.io.IOException;

public class JsonIntoFile {
    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        try {
            Laptop object = mapper.readValue(new File("target/result.json"), Laptop.class);
            System.out.println(object);
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

