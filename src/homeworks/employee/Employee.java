package homeworks.employee;

import java.util.Objects;

public class Employee {
    private String name;
    private String surname;
    private String emplyeeID;
    private int salary;
    private String company;
    private String position;
    private PositionLevel level;


    public Employee(){

    }

    public Employee(String name, String surname, int salary, String company, String position, PositionLevel level) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.company = company;
        this.position = position;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmplyeeID() {
        return emplyeeID;
    }

    public void setEmplyeeID(String emplyeeID) {
        this.emplyeeID = emplyeeID;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public PositionLevel getLevel() {
        return level;
    }

    public void setLevel(PositionLevel level) {
        this.level = level;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return salary == employee.salary && Objects.equals(name, employee.name) && Objects.equals(surname, employee.surname) && Objects.equals(emplyeeID, employee.emplyeeID) && Objects.equals(company, employee.company) && Objects.equals(position, employee.position) && level == employee.level;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, emplyeeID, salary, company, position, level);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", emplyeeID='" + emplyeeID + '\'' +
                ", salary=" + salary +
                ", company='" + company + '\'' +
                ", position='" + position + '\'' +
                ", level=" + level +
                '}';
    }
}
