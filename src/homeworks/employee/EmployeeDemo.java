package homeworks.employee;

import java.util.Scanner;

public class EmployeeDemo {

    private static Scanner scanner = new Scanner(System.in);
    private static EmployeeStroga employeeStroga = new EmployeeStroga();

    static void main() {

        boolean isRun = true;
        while (isRun) {
            printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case "0":
                    isRun = false;
                    break;
                case "1":
                    addEmployee();
                    break;
                case "2":
                    employeeStroga.print();
                    break;
                case "3":
                    System.out.println("Please input employee's ID for search employee");
                    String searchId = scanner.nextLine();
                    try {
                        Employee employee1 = employeeStroga.searchID(searchId);
                        System.out.println(employee1);
                    } catch (EmployeeNotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case "4":
                    System.out.println("Please input company's name for search");
                    String compane = scanner.nextLine();
                    employeeStroga.searchCompane(compane);
                    break;
                case "5":
                    System.out.println("Please input Employee's level for search");
                    printLevels();
                    String level = scanner.nextLine();
                    PositionLevel positionLevel = PositionLevel.valueOf(level);
                    employeeStroga.searchByLevel(positionLevel);
                    break;
                default:
                    System.out.println("Wrong command, Please Try again");
            }
        }

    }

    private static void addEmployee() {
        System.out.println("Please input employee name");
        String name = scanner.nextLine();
        System.out.println("Please input employee surname");
        String surname = scanner.nextLine();
        System.out.println("Please  input employee's salary");
        int salary = Integer.parseInt(scanner.nextLine());
        System.out.println("Please input company name");
        String company = scanner.nextLine();
        System.out.println("Please input employee's position");
        String position = scanner.nextLine();
        System.out.println("Please choose employee's level");
        String level = scanner.nextLine();
        PositionLevel positionLevel=PositionLevel.valueOf(level);
        Employee employee = new Employee(name, surname, salary, company, position,positionLevel);
        employeeStroga.add(employee);
        System.out.println("employee added successfully");
    }

    private static void printCommands() {
        System.out.println("Please input 0 for EXIT");
        System.out.println("Please input 1 for ADD EMPLOYEE ");
        System.out.println("Please input 2 for PRINT ALL EMPLOYEE");
        System.out.println("Please input 3 for SEARCH EMPLOYEE BY EMPLOYEE ID ");
        System.out.println("Please input 4 for SEARCH EMPLOYEE BY COMPANY NAME ");
        System.out.println("Please input 5 for SEARCH EMPLOYEES BY POSITION LEVEL ");
    }

    private static void printLevels() {
        PositionLevel[] print = PositionLevel.values();
        for (PositionLevel positionLevel : print) {
            System.out.println(positionLevel + " ");
        }
        System.out.println();
    }
}

