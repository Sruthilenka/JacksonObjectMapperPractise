package DeSerialize.StringToMapOfObjects;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Map;

public class MapOfObjs {
    public static void main(String[] args) {
        String json ="{\"brand\":\"Abc\",\"model\":\"XYZ\"}";
        ObjectMapper mapper = new ObjectMapper();
        try {
           Map<String,String>object = mapper.readValue(json,new TypeReference<Map<String,String>>(){});
            object.keySet().forEach(key->{
                System.out.println("key: "+key);
                System.out.println("Value: "+object.get(key));
            });
        } catch (JsonMappingException e) {
            throw new RuntimeException(e);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
