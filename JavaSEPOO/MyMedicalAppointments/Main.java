package JavaSEPOO.MyMedicalAppointments;

public class Main {
    public static void main(String[] args) {
        Doctor myDoctor =new Doctor();
        myDoctor.name="Alejandro Rodriguez";
        myDoctor.speciality="Cardiologia";
        myDoctor.showName();
        myDoctor.showId();
        myDoctor.showSpeciality();


        IUMenu.showMenu();

    }

    

   

    
}
