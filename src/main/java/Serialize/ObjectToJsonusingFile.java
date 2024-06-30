package Serialize;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import utilities.Laptop;

import java.io.File;
import java.io.IOException;

public class ObjectToJsonusingFile {
    public static void main(String[] args) {
        Laptop lap = new Laptop();
        lap.setBrand("Abc");
        lap.setModel("XYZ");

        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.writeValue(new File("target/result.json"), lap);
        } catch (StreamWriteException e) {
            throw new RuntimeException(e);
        } catch (DatabindException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
