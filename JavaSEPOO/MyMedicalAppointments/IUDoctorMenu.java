package JavaSEPOO.MyMedicalAppointments;

import java.util.ArrayList;
import java.util.Scanner;

public class IUDoctorMenu {

    public static ArrayList<Doctor>doctorsAvailableAppointments=new ArrayList<>();
    public static void ShowDoctorMenu(){
        int response =0;

        do {
            System.out.println("\n\n");
            System.out.println("Doctor");
            System.out.println("Welcome "+IUMenu.doctorLogged.getName());
            System.out.println("1. Add Available Appointment");
            System.out.println("2. My Scheduled appointments");
            System.out.println("0. Logout");
            Scanner sc=new Scanner(System.in);
            response=Integer.valueOf(sc.nextLine());

            switch (response) {
                case 1:
                    showAddAvailableAppointmentsMenu();
                    break;
                case 2:
                    break;
                case 0:
                    IUMenu.showMenu();
                    break;
            }

        } while (response !=0);
    }
    
    private static void showAddAvailableAppointmentsMenu(){
        int response =0;
        do {
            System.out.println();
            System.out.println("::Add Available Appointment");
            System.out.println(":: Select a Month");

            for (int i = 0; i < 4; i++) {
                int j= i+1;
                System.out.println(j+". "+IUMenu.MONTHS[i]);
            }
            /*for (int j = 0; j < 3; j++) {
                int i= j+1;
                System.out.println(i+". "+IUMenu.MONTHS);
            }
            */
            System.out.println("0. Return");
          
            Scanner sc=new Scanner(System.in);
            response=Integer.valueOf(sc.nextLine());

            if (response>0 &&response<4) {
                //1,2,3
                int monthSelected=response;
                System.out.println(monthSelected+". "+IUMenu.MONTHS[monthSelected-1]);
                
                System.out.println("Insert the date available: [dd/mm/yyyy]");
                String date=sc.nextLine();

                System.out.println("Your date is: "+date+"\n1. Correct \n2. Change Date");
                int responseDate =Integer.valueOf(sc.nextLine());
                if (responseDate==2) continue;

                int responseTime=0;
                String time="";
                do {
                    System.out.println("Insert the time available for date: "+ time+"[16:00]");
                    time=sc.nextLine();
                    System.out.println("Your time is: "+time+"\n1.Correct \n2.Change Time");
                    responseTime=Integer.valueOf(sc.nextLine());
                    if(responseTime == 1){
                        System.out.println("Thank you!");
                    }
                } while (responseTime==2);
                IUMenu.doctorLogged.addAvailableAppointments(date, time);
                checkDoctorAvailableAppointments(IUMenu.doctorLogged);

            }else if (response==0) {
                ShowDoctorMenu();
                
            }

        } while (response !=0);
    }
    
    private static void checkDoctorAvailableAppointments(Doctor doctor){
        if (doctor.getAvailableAppointment().size()>0 
        && !doctorsAvailableAppointments.contains(doctor)) {
            doctorsAvailableAppointments.add(doctor);
            
        }
    }

}
