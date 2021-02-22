package ProyectoUber;
import java.util.ArrayList;
import java.util.Map;

public class UberVan extends car{
    Map<String, Map<String, Integer>> typecarAccepted;
    ArrayList<String> seatsMaterial;
    public UberVan (String license, account driver, 
        Map<String, Map<String, Integer>> typecarAccepted,
        ArrayList<String> seatsMaterial){
        super(license, driver);
        this.typecarAccepted = typecarAccepted;
        this.seatsMaterial = seatsMaterial;
    }
    
}
