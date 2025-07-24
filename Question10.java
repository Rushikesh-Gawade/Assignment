/*Construct a hierarchy of employees.
 a. Create an Employee class with attributes like employee id, name, date of birth.
b. Inherit class WageEmployee from super class Employee
c. WageEmployee class should have following members
a. Number of hours worked
b. Rate per hour
d. Inherit class SalesPerson from super class WageEmployee. SalesPerson should have following
members
a. Number of items sold
b. Commission per item
e. Write constructors for WageEmployee and SalesPerson classes.
f. Override the methods for displaying details, calculating salary in WageEmployee and
 SalesPerson class.
WageEmployee Salary = hours * rate
SalesPerson Salary = hours*rate + sales*commission*/

class Employee {
    private int employee_id;
    private String name;
    private int DOB;

    public Employee(int employee_id, String name, int DOB) {
        this.employee_id = employee_id;
        this.name = name;
        this.DOB = DOB;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public String getName() {
        return name;
    }

    public int getDOB() {
        return DOB;
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + employee_id);
        System.out.println("Name: " + name);
        System.out.println("DOB: " + DOB);
    }
}


class WageEmployee extends Employee {
    private int HrWOrked;
    private int RateHR;

    public WageEmployee(int employee_id, String name, int DOB, int HrWOrked, int RateHR) {
        super(employee_id, name, DOB);
        this.HrWOrked = HrWOrked;
        this.RateHR = RateHR;
    }

    public int getHrWOrked() {
        return HrWOrked;
    }

    public void setHrWOrked(int hrWOrked) {
        HrWOrked = hrWOrked;
    }

    public int getRateHR() {
        return RateHR;
    }

    public void setRateHR(int rateHR) {
        RateHR = rateHR;
    }

    public double calculateSalary() {
        return HrWOrked * RateHR;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Hours Worked: " + HrWOrked);
        System.out.println("Rate per Hour: " + RateHR);
        System.out.println("Salary: " + calculateSalary());
    }
}


class SalesPerson extends WageEmployee {
    private int itemSold;
    private int commission;

    public SalesPerson(int employee_id, String name, int DOB, int HrWOrked, int RateHR, int itemSold, int commission) {
        super(employee_id, name, DOB, HrWOrked, RateHR);
        this.itemSold = itemSold;
        this.commission = commission;
    }

    public int getItemSold() {
        return itemSold;
    }

    public void setItemSold(int itemSold) {
        this.itemSold = itemSold;
    }

    public int getCommission() {
        return commission;
    }

    public void setCommission(int commission) {
        this.commission = commission;
    }

    public double calculateSalary() {
        return super.getHrWOrked() * super.getRateHR() + itemSold * commission;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Items Sold: " + itemSold);
        System.out.println("Commission per Item: " + commission);
        System.out.println("Total Salary: " + calculateSalary());
    }
}

public class Question10 {
    public static void main(String[] args) {
        System.out.println("Wage Employee");
        WageEmployee we = new WageEmployee(101, "Rahul", 19900101, 40, 200);
        we.displayDetails();

        System.out.println("Sales Person");
        SalesPerson sp = new SalesPerson(102, "Priya", 19920315, 35, 150, 20, 50);
        sp.displayDetails();
    }
}
