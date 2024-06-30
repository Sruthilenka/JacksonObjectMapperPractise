package utilities;

public class Laptop {


    private String brand;
    private String model;

    //Default Constructor
    public Laptop(){
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
        return "Laptop{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
