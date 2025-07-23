import java.util.Scanner;

public class Java_Basics3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = 3;

        int[][] matrix1 = new int[size][size];
        int[][] matrix2 = new int[size][size];
        int[][] transpose = new int[size][size];
        int[][] sum = new int[size][size];

        System.out.println("Enter elements of first 3x3 matrix:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("First matrix:");
        for (int[] row : matrix1) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                transpose[j][i] = matrix1[i][j];
            }
        }

        System.out.println("Transpose of first matrix:");
        for (int[] row : transpose) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        System.out.println("Enter elements of second 3x3 matrix:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        System.out.println("Sum of the two matrices:");
        for (int[] row : sum) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
