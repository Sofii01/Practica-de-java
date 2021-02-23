package JavaSE;

public class Funciones {
    public static void main(String[] args) {
        double y=3;
        //Area de un circulo 
        //pi*r2
        circleArea(y);
    
        //Area de una esfera
        //4*pi*r2
        sphereArea(y);
        //Volumen de una esfera
        //(4/3)*pi*r3
        sphereVolumen(y);
        System.out.println("Pesos a dolares: " + converToDolar(400, "ARG"));
    }
    public static double circleArea(double r){
        return Math.PI * Math.pow(r, 2);
    }
    public static double sphereArea(double r){
        return 4*Math.PI* Math.pow(r, 2);
    }
    public static double sphereVolumen(double r){
        return (4/3)* Math.PI * Math.pow(r, 3);
    }

    /**
     * Descripcion: Funcion que especifacando su moneda convierte una 
     *  cantidad de dinero a dolares
     * @param quantity Cantidad de dinero
     * @param currency Tipo de moneda: solo acepta MXN o COP
     * @return quantity Devuelve la cantidad actualizada en Dolares
     */
    public static double converToDolar(double quantity, String currency){
        //MXN(mexicanos) COP(colombiano) ARG
        switch (currency){
            case "MXN":
                quantity = quantity*0.052;
                break;
            case "COP":
                quantity=quantity*0.00031;
                break;
            case "ARG":
                quantity = quantity*0.011;
                break;

        }
        return quantity;
    }

}
