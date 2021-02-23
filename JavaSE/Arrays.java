package JavaSE;

public class Arrays {
    public static void main(String[] args) {
        String[] androidVersions=new String[17]; 
        int days[]=new int[7];
        //bidimensional: de 2[filas][columnas] [4][2]= 4*2=8
        String[][] cities=new String[4][2];
        //tridimensional: 
        int[][][] numbers =new int [2][2][2];
        //4 dimensiones de arreglos
        int[][][][] numbers4=new int [2][2][2][2];


        //Asignamos datos a un arreglo
        androidVersions[0]="Apple Pie";
        androidVersions[1]="Banana Bread";
        androidVersions[2]="Cupcake";
        androidVersions[3]="Donut";
        //Como se accede al dato
        for (int i = 0; i <=3; i++) {
            System.out.println(androidVersions[i]);
            
        }
        
        /*System.out.println(androidVersions[0]);
        System.out.println(androidVersions[1]);
        System.out.println(androidVersions[2]);
        System.out.println(androidVersions[3]);
        */

        System.out.println();
        System.out.println();

        cities[0][0]= "Colombia";
        cities[0][1]= "Medellin";
        cities[1][0]= "Colombia";
        cities[1][1]= "Bogotá";
        cities[2][0]= "Mexico";
        cities[2][1]= "Guadalajara";
        cities[3][0]= "Mexico";
        cities[3][1]= "CDMX";

        /*System.out.println(cities[0][0]);
        System.out.println(cities[0][1]);
        System.out.println(cities[1][0]);
        System.out.println(cities[1][1]);
        System.out.println(cities[2][0]);
        System.out.println(cities[2][1]);
        System.out.println(cities[3][0]);
        System.out.println(cities[3][1]);
        */
       /* for (int i = 0; i < cities.length; i++) {
            for (int j = 0; j < cities[i].length; j++) {
                System.out.println(cities[i][j]);
            }
            
        }*/
        for (String[] pair : cities) {
            for (String name: pair) {
                System.out.println("name");
                
            }
            
        }

        String [][][][] animals=new String [2][3][2][2];
        animals [1][0][0][1]="Monkey";
        /*System.out.println();
        System.out.println();
        System.out.println(animals [1][0][0][1]);
        */
       
        for (int i = 0; i <=1; i++) {
            for (int j = 0; j <=0; j++) {
                for (int j2 = 0; j2 <=0; j2++) {
                    for (int k = 0; k <=1; k++) {
                        System.out.println(animals[i][j][j2][k]);
                        
                    }
                }
                
            }
        }


    }
    
}
