/*Declare an interface printable as given below.
interface printable
{
public void printDetails();
}
Write a class CktPlayer with members - name and runs
Write a class FtPlayer with members - name and goals
CktPlayer and FtPlayer implements printable interface and overrides its method to
display details.*/
interface  printable {
    public void printDetails();   
}

class CktPlayer implements printable{
    String name = "Sachine";
    int run = 15000;

    @Override
    public void printDetails() {
        System.out.println(name + " " + run);
    }
}

class FtPlayer implements printable{
    String name = "Ronlod";
    int goals = 700;

    @Override
    public void printDetails() {
        System.out.println(name + " " +goals);
    }
}

public class Question12 {
    public static void main(String[] args) {
       CktPlayer obj = new CktPlayer();
       obj.printDetails();
       
       FtPlayer obj1 = new FtPlayer();
       obj1.printDetails();
    }
}
