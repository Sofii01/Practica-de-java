package ProyectoUber;

public class main {
    public static void main (String[] args) {
        System.out.println("Hola mundo");
        UberX uberX = new UberX("AMQ123", new account("Andres Herrera", 
        "AND123"), "Chevrolet", "Sonic" ); 
        //java te da por defecto un constructor en todo los objetos
        uberX.passenger= 4;
        uberX.printDatacar();  
        
        

        
    }
}
