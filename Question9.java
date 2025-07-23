/*Write a class Student having following –
a. Student Roll Number (int)
b. Student Name (String)
c. Date of Birth (Date class object where Date is user defined class)
Implement default constructor, parameterized constructor, accept, display. Generate the
student roll number automatically*/

import java.util.Scanner;

class Date{
    private int day;
    private int month;
    private int year;
    
    public Date(){
        this.day = 1;
        this.month = 1;
        this.year = 2000;
    }

    public Date(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void accept(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day: ");
        day = sc.nextInt();
        System.out.print("Enter month: ");
        month = sc.nextInt();
        System.out.print("Enter year: ");
        year = sc.nextInt();
    }
     public void display() {
        System.out.println(day + "/" + month + "/" + year);
    }
}

class Student {
    private static int nextRollNumber = 1; 
    private int rollNumber;
    private String name;
    private Date dob;


    public Student() {
        this.rollNumber = nextRollNumber++;
        this.name = "";
        this.dob = new Date();
    }
    public Student(String name, Date dob) {
        this.rollNumber = nextRollNumber++;
        this.name = name;
        this.dob = dob;
    }

    public void accept() {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Enter Student Name: ");
        name = sc.nextLine();

        System.out.println("Enter Date of Birth:");
        dob = new Date();
        dob.accept();
    }

    public void display() {
        System.out.println("Student Roll Number: " + rollNumber);
        System.out.println("Student Name: " + name);
        System.out.print("Date of Birth: ");
        dob.display();
    }
}


class Question9 {
    public static void main(String[] args) {
         Student s1 = new Student();       
        s1.accept();                     
        System.out.println("\nStudent Details:");
        s1.display();

        System.out.println();

        Date dob = new Date(15, 7, 2001);
        Student s2 = new Student("Alice", dob);
        System.out.println("\nStudent Details:");
        s2.display();
    }
}
