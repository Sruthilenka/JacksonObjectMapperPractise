package utilities;

public class jsonPOJO {

    private String brand;
    private String model;

    //Default Constructor
    public jsonPOJO(){
    }

    public String getBrand(){
        return brand;
    }

    public String getModel(){
        return model;
    }

    public void setBrand(String brand){
        this.brand= brand;
    }

    public void setModel(String model){
        this.model=model;
    }

    @Override
    public String toString() {
        return "JsonPOJO{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
