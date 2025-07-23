/*Write a class Student with members for rollno, name and percentage. Implement necessary
methods inside class. Write a code to print number of objects created for class Student. Use
static.
7. Implement getter/setter methods and method “toString” in above class Student.*/
class Student{
    private int rollno;
    private String name;
    private Double percentage;

    private  int count = 0;

    public  int getCount(){
    return count;
   }

     public Student(int rollno,String name,Double percentage){
        this.rollno = rollno;
        this.name = name;
        this.percentage = percentage;
        count++;
    }

    public int getRollno() {
        return rollno;
    }
    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getPercentage() {
        return percentage;
    }
    public void setPercentage(Double percentage) {
        this.percentage = percentage;
    }

    public String toString(){
        return "Student [Roll No: " + rollno + ", Name: " + name + ", Percentage: " + percentage + "]";
    }
}

public class CassesandObjects6and7{
    public static void main(String[] args) {
       Student obj1 = new Student( 16, "Rushikesh", 61.8);
       Student obj2 = new Student( 07, "Vednat", 64.0);

       System.out.println(obj1);
       System.out.println(obj2);
       System.out.println(obj1.getCount());
    }
}
