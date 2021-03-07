package JavaSEPOO.MyMedicalAppointments;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Doctor myDoctor=new Doctor("Anahi Salgado", "anahi@mail.com" , "Pediatria");
        
        myDoctor.addAvailableAppointments(new Date(), "4pm");
        myDoctor.addAvailableAppointments(new Date(), "10am");
        myDoctor.addAvailableAppointments(new Date(), "1pm");
        System.out.println(myDoctor);
        Patient patient =new Patient("Sofia", "sofi@mail.com");
        
        System.out.println(patient);
        

    }

    

   

    
}
