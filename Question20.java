import java.util.Scanner;

public class Question20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        Thread t1 = new Thread() {
            public void run() {
                for (int i = 1; i <= 10; i++) {
                    System.out.println("Incremented: " + (num + i));
                    try {
                        Thread.sleep(100); 
                    } catch (Exception e) {}
                }
            }
        };

        Thread t2 = new Thread() {
            public void run() {
                for (int i = 1; i <= 10; i++) {
                    System.out.println("Table: " + num + " x " + i + " = " + (num * i));
                    try {
                        Thread.sleep(100); 
                    } catch (Exception e) {}
                }
            }
        };

        t1.start();
        t2.start();
    }
}
