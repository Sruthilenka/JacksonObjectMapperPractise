package DeSerialize.StringToArrayOfObjs;

import utilities.Laptop;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ArrayOfObjs {
    public static void main(String[] args) {
        //json String here contains an array of dictionaries
           String json = "[{\"brand\":\"Abc\",\"model\":\"XYZ\"},{\"brand\":\"Def\",\"model\":\"UVX\"}]";
            ObjectMapper mapper = new ObjectMapper();
            try {
                //Convert to array of the pojo class type
                Laptop[] objects = mapper.readValue(json, Laptop[].class);
                for(Laptop jp: objects )
                System.out.println(jp);
            } catch (JsonMappingException e) {
                e.printStackTrace();
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }
        }
    }

