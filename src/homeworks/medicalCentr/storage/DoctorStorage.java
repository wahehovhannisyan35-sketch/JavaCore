package homeworks.medicalCentr.storage;

import homeworks.medicalCentr.model.Doctor;

public class DoctorStorage {
    private Doctor[] doctors=new Doctor[10];
    private int size=0;
    private int id=1;

    public void addDoctor(Doctor doctor){
        if (size==doctors.length){
            extend();
        }
        doctors[size]=doctor;
        doctors[size++].setId(id++);
    }
    private void extend(){
        Doctor[] newDoctor=new Doctor[size+10];
        System.arraycopy(doctors,0,newDoctor,0,size);
        doctors=newDoctor;
    }
    public void print(){
        for (int i = 0; i <size ; i++) {
            System.out.println(doctors[i]);
        }

    }
    public void doctorFoundingByProfession(String doctorFound){
        boolean bool=true;
        for (int i = 0; i <size ; i++) {
            if (doctorFound.contains(doctors[i].getProfession())){
                System.out.println(doctors[i]);
                bool=false;
            }
        }
        if (bool){
            System.out.println("Doctor by that"+ doctorFound + "NOT FOUND PLEASE TRY AGAIN");
        }
    }
    public void deleteById(int idForDelete){
        if (idForDelete<size){
            for (int i = idForDelete; i <size ; i++) {
                if (i!=size-1){
                    doctors[i]=doctors[i+1];
                    doctors[i].setId(i+1);
                }
            }
            this.id=size--;
        }else {
            System.out.println("Doctor by that id"+ idForDelete+ "NOT FOUND PLEASE TRY AGAIN");
        }
    }
    public Doctor doctorFoundById(int idForChange){
        for (int i = 0; i <size ; i++) {
            if (idForChange==doctors[i].getId()){
                return doctors[i];
            }
        }
     return null;
    }
    public Doctor findByDoctorName(String doctorName)throws DoctorNotFindByNameException{
        for (int i = 0; i < size; i++) {
            if (doctorName.contains(doctors[i].getName())){
                return doctors[i];
            }
        }
        throw new DoctorNotFindByNameException("Doctor by that"+ doctorName +"NOT FOUND PLEASE TRY AGAIN");
    }
}
