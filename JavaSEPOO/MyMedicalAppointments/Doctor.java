package JavaSEPOO.MyMedicalAppointments;

public class Doctor {
    static int id =0; //autoincrement
    String name;
    String speciality;

    Doctor(){
        
    }
    Doctor(String name, String speciality){
        System.out.println("El nombre del Doctor asignado es: " +name);
        id++;
    }
    public void showId(){
        System.out.println("ID Doctor: "+id);
    }
    //Comportamientos
    public void showName(){
        System.out.println("El nombre del Doctor es: "+ name);
    }
    public void showSpeciality(){
        System.out.println("La especialidad del doctor es: "+speciality);
    }
    
}
