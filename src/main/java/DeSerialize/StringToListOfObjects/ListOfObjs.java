package DeSerialize.StringToListOfObjects;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import utilities.Laptop;

import java.util.List;

public class ListOfObjs {
    public static void main(String[] args) {
        //json String here contains an array of dictionaries
        String json = "[{\"brand\":\"Abc\",\"model\":\"XYZ\"},{\"brand\":\"Def\",\"model\":\"UVX\"}]";
        ObjectMapper mapper = new ObjectMapper();
        try {
            //Have to pass an object of Jackson's type reference class
            List<Laptop> objects = mapper.readValue(json, new TypeReference<List<Laptop>>(){});
            for(Laptop jp: objects )
                System.out.println(jp);
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
}


