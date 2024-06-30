package Serialize;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import utilities.jsonPOJO;

import java.io.IOException;
import java.io.StringWriter;

public class JavaObjectToJsonString {
    public static void main(String[] args) {
        jsonPOJO jpojo = new jsonPOJO();
        jpojo.setBrand("Abc");
        jpojo.setModel("XYZ");

        ObjectMapper mapper = new ObjectMapper();
        //Can write the string to the writer - Writer is an abstraction used for writing JSON content. It represents an output destination where JSON data is written, such as a file, network stream, or any other output sink.
        StringWriter writer = new StringWriter();
        try{
            mapper.writeValue(writer,jpojo);

            //convert this writer to String
            String json= writer.toString();
            System.out.println(json);
        }catch (StreamWriteException e) {
            throw new RuntimeException(e);
        } catch (DatabindException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
