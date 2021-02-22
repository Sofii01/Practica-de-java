package JavaSE;

public class IncrementDecrement {
    public static void main(String[] args) {
        
        int lives=5;
        lives= lives-1;
        System.out.println(lives);//4
        //manera postfija
        lives--;//operador decremento
        System.out.println(lives);//3

        lives++;//operador incremento
        System.out.println(lives);//4
        //manera prefija
        //Gana un regalo por ganar una vida
        int gift=100 + ++lives;
        System.out.println(gift);
        System.out.println(lives);



    }
}