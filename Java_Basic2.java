/*Accept five integers in an array -
a. Find maximum and minimum of the integers. Do not sort the array.
b. Multiply each element of the array by 5 and store it in another array and display it*/

import java.util.Scanner;
public class Java_Basic2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[5];
        int[] multipliedArr = new int[5];

        System.out.println("Enter 5 integers:");

        for (int i = 0; i < 5; i++) {
            arr[i] = scanner.nextInt();
        }

        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < 5; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        for (int i = 0; i < 5; i++) {
            multipliedArr[i] = arr[i] * 5;
        }

        System.out.println("Maximum number: " + max);
        System.out.println("Minimum number: " + min);
        System.out.print("Array elements multiplied by 5: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(multipliedArr[i] + " ");
        }

        scanner.close();
    }
}
