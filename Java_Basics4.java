import java.util.Scanner;



public class Java_Basics4 {

public static int Add(int a, int b){
    return a+b;
}  

public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    System.out.println(Add(a, b));
    }
}
