package JavaSE;
            //Upper Camel Case
public class NamingJava {
    public static void main(String[] args) {
        int celphone = 33335555;
        int celPhone = 66669999;
        System.out.println(celphone);
        System.out.println(celPhone);

        String $countryName="Spain";
        String _backgroundColor="Green";
        System.out.println($countryName +_backgroundColor);

        String currency$= "MCV";
        String background_color="Blue";
        System.out.println(currency$ + background_color);

        int POSITION= -5;
        int MAX_WIDTH=999;
        int MIN_WIDTH=3;
        System.out.println(POSITION+ MAX_WIDTH+ MIN_WIDTH);
        //Lower Camel Case
        String fullName="Irene Anahi Salgado Diaz";
        int sizeInCentimeters= 26;
        System.out.println("Name: " + fullName + " " + sizeInCentimeters);
        

    }
    
}
