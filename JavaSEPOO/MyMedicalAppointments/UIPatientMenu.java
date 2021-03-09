package JavaSEPOO.MyMedicalAppointments;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class UIPatientMenu {

    public static void showPatientMenu(){
        int response=0;
        do {
            System.out.println("\n\n");
            System.out.println("Patient");
            System.out.println("Welcome: "+ IUMenu.patientLogged.getName());
            System.out.println("1. Book an appointment");
            System.out.println("2. My Appointments");
            System.out.println("0. Logout");

            Scanner sc=new Scanner(System.in);
            response=Integer.valueOf(sc.nextLine());
            switch (response) {
                case 1:
                    showBookAppointmentMenu();
                    break;
                case 2:
                    showPatientMyAppointments();
                    break;
                case 0:
                    IUMenu.showMenu();
                    break;
                default:
                    break;
            }
        } while (response!=0);
    }
    
    private static void showBookAppointmentMenu(){

        int response =0;
        do {
            System.out.println("::Book an appointment");
            System.out.println("::Select date");
            /*Numeracion de la lista de las fechas
            Indice fecha seleccionada
            [doctors]
            1.-doctor1
                -1 fecha1
                -2 fecha2
            2.-doctor2
            3.-doctor3
            */
            Map<Integer, Map<Integer, Doctor>>doctors=new TreeMap<>();
            int k=0;
            for (int i = 0; i < IUDoctorMenu.doctorsAvailableAppointments.size(); i++) {
                ArrayList<Doctor.AvailableAppointment>availableAppointments
                =IUDoctorMenu.doctorsAvailableAppointments.get(i).getAvailableAppointment();
               
                Map<Integer, Doctor>doctorAppointments=new TreeMap<>();
                for (int j = 0; j < availableAppointments.size(); j++) {
                    k++;
                    System.out.println(k+". "+availableAppointments.get(j).getDate());
                    doctorAppointments.put(Integer.valueOf(j), IUDoctorMenu.doctorsAvailableAppointments.get(i));
                    doctors.put(Integer.valueOf(k), doctorAppointments);
                    
                }
            }
            int responseDateSelected=0;
            Scanner sc=new Scanner(System.in);
            responseDateSelected=Integer.valueOf(sc.nextLine());
            Map<Integer, Doctor>doctorAvailableSelected=doctors.get(responseDateSelected);
            Integer indexDate=0;
            Doctor doctorSelected=new Doctor("", "");

            for (Map.Entry<Integer, Doctor>doc:doctorAvailableSelected.entrySet()) {
                indexDate=doc.getKey();
                doctorSelected=doc.getValue();   
            }

            System.out.println(doctorSelected.getName()+". Date: "+ 
                doctorSelected.getAvailableAppointment().get(indexDate).getDate()+ ". Time: "+
                doctorSelected.getAvailableAppointment().get(indexDate).getTime());
            System.out.println("Confirm your appointment: \n1. Yes \n2. Change Date");
            response=Integer.valueOf(sc.nextLine());
            
            if (response ==1) {
                IUMenu.patientLogged.addAppointmentDoctors(
                    doctorSelected,
                    doctorSelected.getAvailableAppointment().get(indexDate).geDate(null),
                    doctorSelected.getAvailableAppointment().get(indexDate).getTime());
                showPatientMenu();
            }

        } while (response !=0);
    }

    private static void showPatientMyAppointments(){
        int response=0;
        do {
            System.out.println("::My Appointments");
            if (IUMenu.patientLogged.getAppointmentDoctors().size()==0) {
                System.out.println("Don't have appointments");
                break;
            }
            for (int i = 0; i < IUMenu.patientLogged.getAppointmentDoctors().size(); i++) {
                int j=i+1;
                System.out.println(j+". "+ "Date: "+
                    IUMenu.patientLogged.getAppointmentDoctors().get(i).getDate()+
                    "Time: "+ IUMenu.patientLogged.getAppointmentDoctors().get(i).getTime()+
                    "\nDoctor"+IUMenu.patientLogged.getAppointmentDoctors().get(i).getDoctor().getName());
                
            }
            System.out.println("0. Return");
        } while (response!=0);
    }
}

