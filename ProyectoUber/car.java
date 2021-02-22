package ProyectoUber;

public class car {
    Integer id;
    String license;
    account driver;
    Integer passenger;
    
    public car(String license, account driver){
        this.license =license;
        this.driver = driver;
    }

    void printDatacar(){
        System.out.println("License: " + license + " Name Driver: " 
        + driver.name + " Passengers: " + passenger);
    }
}
