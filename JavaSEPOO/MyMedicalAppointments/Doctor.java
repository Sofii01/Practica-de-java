package JavaSEPOO.MyMedicalAppointments;


import java.util.ArrayList;

import java.util.Date;

public class Doctor extends User{
    
    private String speciality;
      
    public String getSpeciality() {
        return speciality;
    }
    
    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
    
    
    Doctor(String name, String email, String speciality){
        super(name, email);
        this.speciality=speciality;
        System.out.println("El nombre del Doctor asignado es: " +name);
    }
    
    public void showSpeciality(){
        System.out.println("La especialidad del doctor es: "+speciality);
    }

    ArrayList<AvailableAppointment>availableAppointments= new ArrayList<>();
    public void addAvailableAppointments(Date date, String time){
        availableAppointments.add(new Doctor.AvailableAppointment(date, time));

    }

    public ArrayList<AvailableAppointment>getAvailableAppointment(){
        return availableAppointments;

    }
    @Override
    public String toString() {
        return super.toString() +"\nSpeciality: "+speciality+
        "\nAvailable: "+availableAppointments.toString();
    }

    public static class AvailableAppointment{
        private static Date Date =null;
        private int id;
        private Date date;
        private String time;

       
        /**
         * @return the date
         */
        public Date getDate() {
            return date;
        }

        /**
         * @param date the date to set
         */
        public void setDate(Date date) {
            this.date = date;
        }

        /**
         * @return the time
         */
        public String getTime() {
            return time;
        }

        /**
         * @param time the time to set
         */
        public void setTime(String time) {
            this.time = time;
        }
        
        @Override
        public String toString() {
    
            return "Available Appointments \nDate: "+ date+
            "\nTime: "+ time;
            
        }

        /**
         * @param date
         * @param time
         */
        public AvailableAppointment(java.util.Date date, String time) {
            this.date = date;
            this.time = time;
        }
        
        
    }

  

    

   
    

}
