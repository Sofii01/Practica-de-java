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
        
        
        patient.setWeight(54.6);
        System.out.println(patient.getWeight());
        patient.setPhoneNumber("12345678");
        System.out.println(patient.getPhoneNumber());

        

    }

    

   

    
}
