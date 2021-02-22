package ProyectoUber;

import java.util.ArrayList;
import java.util.Map;

public class UberBlack extends car{

    Map<String, Map<String, Integer>> typecarAccepted;
    ArrayList<String> seatsMaterial;
    public UberBlack (String license, account driver, 
        Map<String, Map<String, Integer>> typecarAccepted,
        ArrayList<String> seatsMaterial){
        super(license, driver);
        this.typecarAccepted = typecarAccepted;
        this.seatsMaterial = seatsMaterial;


    }
}
