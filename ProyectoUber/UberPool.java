package ProyectoUber;

public class UberPool extends car{
    String brand;
    String model;
    public UberPool(String license, account driver, String brand, String model){
        super(license, driver);
        this.brand = brand; 
        this.model= model;
    }
}
