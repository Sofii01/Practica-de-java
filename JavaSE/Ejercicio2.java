package JavaSE;

public class Ejercicio2 {
    public static void main(String[] args) {
        
    
        char c = 'z'; //conviertelo a int
        int i1 = 250; //conviertelo a long y luego de long a short
        double d = 301.067;// conviertelo a long
        int i2 = 100;// súmale 5000.66 y conviertelo a float
        int i3 = 737; //multiplícalo por 100 y conviertelo a byte
        double d1 = 298.638; //divídelo entre 25 y conviertelo a long


        int cI= c;
        System.out.println(cI);
        long iL=i1;
        System.out.println(iL);
        short iS= (short) iL;
        System.out.println(iS);
        long dL= (long) d;
        System.out.println(dL);
        float iF= (float) (i2 + 5000.66);
        System.out.println(iF);
        byte iB= (byte)(i3*100);
        System.out.println(iB);
        long dL1= (long) (d1 / 25);
        System.out.println(dL1);


    }
}
