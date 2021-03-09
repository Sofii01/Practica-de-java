package JavaSEPOO.MyMedicalAppointments;

import java.util.ArrayList;
import java.util.Date;

public class Patient extends User{

    private String birthday;
    private Double weight;
    private Double height;
    private String blood;


    private ArrayList<AppointmentDoctor>appointmentDoctors=new ArrayList<>();
    private ArrayList<AppointmentNurse>appointmentNurses=new ArrayList<>();
    


    public Patient (String name, String email){
        super(name, email);
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getWeight() {
    
        return weight + " Kg.";
    }

    public void setWeight(Double weight) {
        this.weight = weight;
        
    }

    public String getHeight() {
        return height + " Mts.";
    }

    public void setHeight(Double height) {
        this.height = height;
        
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }
    @Override
    public String toString() {
        
        return super.toString()+ "\nAge: "+birthday+ "\nWeight: "+ 
          getWeight()+ "\nHeight: "+getHeight()+ "\nBlood: "+blood;
    }


    @Override
    public void showDataUser() {
        System.out.println("Paciente");
        System.out.println("Historial completo desde nacimiento");
        
    }

    public ArrayList<AppointmentDoctor> getAppointmentDoctors() {
        return appointmentDoctors;
    }


    /**
     * @param appointmentDoctors the appointmentDoctors to set
     */
    public void addAppointmentDoctors(Doctor doctor, Date date, String time) {
        AppointmentDoctor appointmentDoctor=new AppointmentDoctor(this, doctor);
        appointmentDoctor.schedule(date, time);
        appointmentDoctors.add(appointmentDoctor);
        
    }


    /**
     * @return the appointmentNurses
     */
    public ArrayList<AppointmentNurse> getAppointmentNurses() {
        return appointmentNurses;
    }


    /**
     * @param appointmentNurses the appointmentNurses to set
     */
    public void setAppointmentNurses(ArrayList<AppointmentNurse> appointmentNurses) {
        this.appointmentNurses = appointmentNurses;
    }

}
