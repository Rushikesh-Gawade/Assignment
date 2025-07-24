import java.util.ArrayList;
import java.util.Scanner;

class Employee {
    int id;
    String name;
    int salary;

      public Employee(){
        this.id = 0;
        this.name = "";
        this.salary = 0;
    }

    Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void accept(Scanner sc) {
        System.out.print("Enter Employee ID: ");
        id = sc.nextInt();
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Salary: ");
        salary = sc.nextInt();
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }
}

public class Question13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> list = new ArrayList<>();
        int choice;

        do {
            System.out.println("\n1. Add Employee");
            System.out.println("2. Update Employee by ID");
            System.out.println("3. Display All Employees");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    Employee e = new Employee();
                    e.accept(sc);
                    list.add(e);
                    System.out.println("Employee added.");
                    break;

                case 2:
                    System.out.print("Enter Employee ID to update: ");
                    int id = sc.nextInt();
                    boolean found = false;
                    for (Employee emp : list) {
                        if (emp.id == id) {
                            System.out.println("Enter new details:");
                            emp.accept(sc);
                            found = true;
                            System.out.println("Employee updated.");
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Employee not found.");
                    }
                    break;

                case 3:
                    System.out.println("Employee List:");
                    for (Employee emp : list) {
                        emp.display();
                    }
                    break;

                case 4:
                    System.out.println("Exiting program.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 4);

        sc.close();
    }
}
