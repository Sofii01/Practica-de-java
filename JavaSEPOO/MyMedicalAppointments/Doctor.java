package JavaSEPOO.MyMedicalAppointments;

import java.util.ArrayList;
import java.util.Date;

public class Doctor {
    private static final Date Date = null;
    static int id = 0; // autoincrement
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

    ArrayList<AvailableAppointment>availableAppointments= new ArrayList<>();
    public void addAvailableAppointment(String string, String time){
        availableAppointments.add(new Doctor.AvailableAppointment(Date, time));

    }

    public ArrayList<AvailableAppointment>getAvailableAppointment(){
        return availableAppointments;

    }

    public static class AvailableAppointment{
        private int id;
        private Date date;
        private String time;

        /**
         * @param date
         * @param time
         */
        public AvailableAppointment(Date date, String time) {
            this.date = date;
            this.time = time;
        }

        
        
    }
}
