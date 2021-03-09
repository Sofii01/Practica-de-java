package JavaSEPOO.MyMedicalAppointments;

public class Nurse extends User{

    private String speciality;

    public Nurse (String name, String email){
        super(name, email);
    }

    /**
     * @return the speciality
     */
    public String getSpeciality() {
        return speciality;
    }

    /**
     * @param speciality the speciality to set
     */
    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public void showDataUser() {
        System.out.println("Empleado del Hospital: Cruz Verde");
        System.out.println("Departamentos: Nutriología, Pediatría");
        
    }
    

    
}
