/*Write a program to check if given number is Armstrong number. A number is said to be
amstrong nu mber if sum of cube of digits is equal to the original number.
e.g. 153 = 1+125+27= 153*/

import java.util.Scanner;
public class Java_Basic1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int originalNumber = number;
        int sum = 0;
        
        while (number > 0) {
            int digit = number % 10;
            sum += digit * digit * digit;
            number /= 10;
        }

        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is NOT an Armstrong number.");
        }
        
        scanner.close();
    }
}
