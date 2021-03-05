package JavaSEPOO.MyMedicalAppointments;

public class Main {
    public static void main(String[] args) {
        /*Doctor myDoctor =new Doctor();
        myDoctor.name="Alejandro Rodriguez";
        myDoctor.speciality="Cardiologia";
        myDoctor.showName();
        myDoctor.showId();
        myDoctor.showSpeciality();
        */

        //IUMenu.showMenu();
        Doctor myDoctor= new Doctor("Anahi Slagado", "Pediatria");
        System.out.println(myDoctor.name);
        System.out.println(myDoctor.speciality);
 
        Patient patient=new Patient("Alejandra", "alejandra@mail.com");
        System.out.println(patient.getName());
        System.out.println(patient.getEmail());

        System.out.println(patient);
        


    }

    

   

    
}
