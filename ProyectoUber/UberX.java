package ProyectoUber;

public class UberX extends car{
    String brand;
    String model;
    public UberX(String license, account driver, String brand, String model){
        super(license, driver);
        this.brand = brand; 
        this.model= model;
    }
    
}
