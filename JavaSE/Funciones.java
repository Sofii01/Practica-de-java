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
    public static double coverToDolar(double){
        switch
    }

}
