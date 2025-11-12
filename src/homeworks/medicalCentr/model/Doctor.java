package homeworks.medicalCentr.model;

import homeworks.medicalCentr.storage.Person;

import java.util.Objects;

public class Doctor extends Person {
    private String email;
    private String profession;
    private int id;

    public Doctor(String name, String surname, int phone, String email, String profession) {
        super(name, surname, phone);
        this.email = email;
        this.profession = profession;
    }

    public Doctor() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Doctor doctor = (Doctor) o;
        return id == doctor.id && Objects.equals(email, doctor.email) && Objects.equals(profession, doctor.profession);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), email, profession, id);
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "name='" + super.getName() + '\'' +
                ", surname='" + super.getSurname() + '\'' +
                ", id=" + id +
                ", phone=" + super.getPhone() +
                ", email='" + email + '\'' +
                ", profession='" + profession + '\'' +
                "} ";
    }

}
