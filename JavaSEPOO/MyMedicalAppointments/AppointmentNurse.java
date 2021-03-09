package JavaSEPOO.MyMedicalAppointments;

import java.util.Date;

public class AppointmentNurse implements ISchedulable{
    private int id;
    private Nurse nurse;
    private Patient patient;
    private Date date;
    private String time;
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }
    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
    /**
     * @return the nurse
     */
    public Nurse getNurse() {
        return nurse;
    }
    /**
     * @param nurse the nurse to set
     */
    public void setNurse(Nurse nurse) {
        this.nurse = nurse;
    }
    /**
     * @return the patient
     */
    public Patient getPatient() {
        return patient;
    }
    /**
     * @param patient the patient to set
     */
    public void setPatient(Patient patient) {
        this.patient = patient;
    }
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
    public void schedule(Date date, String time) {
        // TODO Auto-generated method stub
        
    }

    
}
