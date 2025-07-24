class Employee {
    private int employee_id;
    private String name;
    private int basicSalary;

    public Employee(int employee_id, String name, int basicSalary) {
        this.employee_id = employee_id;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    public int getBasicSalary() {
        return basicSalary;
    }

    public void display() {
        System.out.println("Employee ID: " + employee_id);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
    }
}

class Manager extends Employee {
    public Manager(int employee_id, String name, int basicSalary) {
        super(employee_id, name, basicSalary);
    }

    public double calculateGrossSalary() {
        double petrolAllowance = 0.08 * getBasicSalary();
        double foodAllowance = 0.12 * getBasicSalary();
        double otherAllowance = 0.04 * getBasicSalary();
        return getBasicSalary() + petrolAllowance + foodAllowance + otherAllowance;
    }

    public double calculateNetSalary() {
        double pf = 0.125 * getBasicSalary();
        return calculateGrossSalary() - pf;
    }

    public void display() {
        System.out.println(" Manager Details ");
        super.display();
        System.out.println("Gross Salary: " + calculateGrossSalary());
        System.out.println("Net Salary: " + calculateNetSalary());
    }
}

class MarketingExecutive extends Employee {
    private int kilometersTravelled;

    public MarketingExecutive(int employee_id, String name, int basicSalary, int kilometersTravelled) {
        super(employee_id, name, basicSalary);
        this.kilometersTravelled = kilometersTravelled;
    }

    public double calculateGrossSalary() {
        double tourAllowance = 5 * kilometersTravelled;
        double telephoneAllowance = 2000;
        return getBasicSalary() + tourAllowance + telephoneAllowance;
    }

    public double calculateNetSalary() {
        double pf = 0.125 * getBasicSalary();
        return calculateGrossSalary() - pf;
    }

    public void display() {
        System.out.println(" Marketing Executive Details ");
        super.display();
        System.out.println("Kilometers Travelled: " + kilometersTravelled);
        System.out.println("Gross Salary: " + calculateGrossSalary());
        System.out.println("Net Salary: " + calculateNetSalary());
    }
}

public class Question11 {
    static void printObjects(Employee e) {
        e.display();
        System.out.println(); 
    }

    public static void main(String[] args) {
        Manager m = new Manager(101, "Arun", 50000);
        MarketingExecutive me = new MarketingExecutive(102, "Sneha", 40000, 150);

        printObjects(m);
        printObjects(me);
    }
}
