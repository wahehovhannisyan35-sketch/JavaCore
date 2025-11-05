package homeworks.employee;

public class EmployeeStroga {
    private Employee[] employees = new Employee[10];
    private int size = 0;
    private String code = "AA000";
    private int idCode = 1;

    public void add(Employee employee) {
        if (size == employees.length) {
            extend();
        }
        employees[size] = employee;
        employees[size++].setEmplyeeID(code + idCode++);
    }

    private void extend() {
        Employee[] tmp = new Employee[10 + size];
        System.arraycopy(employees, 0, tmp, 0, size);
        employees = tmp;

    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
    }

    public Employee searchID(String id) throws EmployeeNotFoundException {
        for (int i = 0; i < size; i++) {
            if (id.contains(employees[i].getEmplyeeID())) {
                return employees[i];
            }
        }
        throw new EmployeeNotFoundException("Employee by Id"+id+"not found!!!, please try again");
    }
    public void searchCompane(String compane){
        for (int i = 0; i < size; i++) {
            if (compane.contains(employees[i].getEmplyeeID())){
                System.out.println(employees[i]);
            }

        }
    }public void searchByLevel(PositionLevel positionLevel){
        for (int i = 0; i <size ; i++) {
            if (positionLevel==employees[i].getLevel()){
                System.out.println(employees[i]);
            }else {
                System.out.println("You have a not "+ positionLevel + " level employee");
            }

        }
    }
}

