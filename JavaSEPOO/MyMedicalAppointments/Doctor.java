package JavaSEPOO.MyMedicalAppointments;

public class Doctor {
    static int id =0; //autoincrement
    String name;
    String speciality;
    String email;
    
    Doctor(String name, String speciality){
        System.out.println("El nombre del Doctor asignado es: " +name);
        id++;
        this.name=name;
        this.speciality=speciality;
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
