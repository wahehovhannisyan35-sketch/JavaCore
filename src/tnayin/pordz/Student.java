package tnayin.pordz;

public class Student {
    private String namee;
    private String surname;
    private String number;
    private Lemguage lemguage;

    public Student(String namee, String surname, String number, Lemguage lemguage) {
        this.namee = namee;
        this.surname = surname;
        this.number = number;
        this.lemguage = lemguage;
    }

    public Student() {
    }

    public String getNamee() {
        return namee;
    }

    public void setNamee(String namee) {
        this.namee = namee;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Lemguage getLemguage() {
        return lemguage;
    }

    public void setLemguage(Lemguage lemguage) {
        this.lemguage = lemguage;
    }

    @Override
    public String toString() {
        return "Student{" +
                "namee='" + namee + '\'' +
                ", surname='" + surname + '\'' +
                ", number='" + number + '\'' +
                ", lemguage=" + lemguage +
                '}';
    }
}
