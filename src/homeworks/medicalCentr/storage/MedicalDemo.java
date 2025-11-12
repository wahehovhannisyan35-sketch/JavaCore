package homeworks.medicalCentr.storage;

import homeworks.medicalCentr.model.Doctor;
import homeworks.medicalCentr.model.Patient;

import java.util.Scanner;

public class MedicalDemo implements Commands{
private static Scanner scanner=new Scanner(System.in);
private static DoctorStorage doctorStorage=new DoctorStorage();
private static PatientStorage patientStorage=new PatientStorage();

    static void main() {
        boolean isRun = true;
        while (isRun) {
            Commands.printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_DOCTOR:
                    System.out.println("Please input doctor's name");
                    String name = scanner.nextLine();
                    System.out.println("Please input doctor's surname");
                    String surname = scanner.nextLine();
                    System.out.println("Please input doctor's phone number");
                    int phone = Integer.parseInt(scanner.nextLine());
                    System.out.println("Please input doctor's email");
                    String email = scanner.nextLine();
                    System.out.println("Please input doctor's profession");
                    String profession = scanner.nextLine();
                    Doctor doctor = new Doctor(name, surname, phone, email, profession);
                    doctorStorage.addDoctor(doctor);
                    System.out.println("Doctor added successfully !!!");
                    break;
                case SEARCH_DOCTOR_BY_PROFESSION:
                    System.out.println("Please input doctor's profession for search");
                    String doctorFoundByProfession = scanner.nextLine();
                    doctorStorage.doctorFoundingByProfession(doctorFoundByProfession);
                    break;
                case DELETE_DOCTOR_BY_ID:
                    System.out.println("Please input doctor id for DELETE");
                    int idfordelete = Integer.parseInt(scanner.nextLine());
                    doctorStorage.deleteById(idfordelete);
                    System.out.println("The doctor has been successfully deleted !!!");
                    break;
                case CHANGE_DOCTOR_BY_ID:
                    System.out.println("Please input doctor's id for change");
                    int idForChange = Integer.parseInt(scanner.nextLine());
                    Doctor changeDoctor = doctorStorage.doctorFoundById(idForChange);
                    if (null != changeDoctor) {
                        System.out.println("Please input doctor's new name for change");
                        String changeName = scanner.nextLine();
                        changeDoctor.setName(changeName);
                        System.out.println("Please input doctor's new surname for change");
                        String changeSurname = scanner.nextLine();
                        changeDoctor.setSurname(changeSurname);
                        System.out.println("Please input doctor's new phone number for change");
                        int changePhoneNumber = Integer.parseInt(scanner.nextLine());
                        changeDoctor.setPhone(changePhoneNumber);
                        System.out.println("Please input doctor's new email for change");
                        String changeEmail = scanner.nextLine();
                        changeDoctor.setEmail(changeEmail);
                        System.out.println("Please input doctor's new profession for change");
                        String changeProfession = scanner.nextLine();
                        changeDoctor.setProfession(changeProfession);
                        System.out.println(changeDoctor);
                        System.out.println("Doctor change added successfully");
                    } else {
                        System.out.println("invalid ID, please try again");
                    }
                    break;
                case ADD_PATIENT:
                    addPatient();
                    break;
                case PRINT_ALL_PATIENTS_BY_DOCTOR:
                    System.out.println("Please input doctor name");
                    String doctorName=scanner.nextLine();
                    patientStorage.foundPatientsByDoctorName(doctorName);
                    break;
                case PRINT_ALL_PATIENTS:
                    patientStorage.print();
                    break;
                default:
                    System.out.println("Wrong command!!!, please try again");

            }
        }
    }private static void addPatient(){
        doctorStorage.print();
        System.out.println("Please input select Doctor's name");
        String doctorName = scanner.nextLine();
        try {
            Doctor doc =  doctorStorage.findByDoctorName(doctorName);
            System.out.println("Please input Patient's name");
            String name = scanner.nextLine();
            System.out.println("Please input Patient's surname");
            String surname = scanner.nextLine();
            System.out.println("Please input Patient's id Card");
            String idCard = scanner.nextLine();
            System.out.println("Please input Patient's phone number");
            int phone = Integer.parseInt(scanner.nextLine());
            Patient patient = new Patient(name, surname, phone, idCard,doc);
            patientStorage.addPatient(patient);
            System.out.println("Patient added successfully ");
        } catch (DoctorNotFindByNameException e) {
            System.err.println(e.getMessage());
        }
    }
}
