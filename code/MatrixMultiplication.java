import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for matrix 1: ");
        int rows1 = scanner.nextInt();
        System.out.print("Enter the number of columns for matrix 1: ");
        int cols1 = scanner.nextInt();

        System.out.print("Enter the number of rows for matrix 2: ");
        int rows2 = scanner.nextInt();
        System.out.print("Enter the number of columns for matrix 2: ");
        int cols2 = scanner.nextInt();

        if (cols1 != rows2) {
            System.out.println("Matrix multiplication is not possible.");
            return;
        }

        int[][] m1 = new int[rows1][cols1];
        int[][] m2 = new int[rows2][cols2];
        int[][] result = new int[rows1][cols2];

        System.out.println("Enter elements for matrix 1:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                System.out.print("Enter element for position (" + (i + 1) + "," + (j + 1) + "): ");
                m1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter elements for matrix 2:");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                System.out.print("Enter element for position (" + (i + 1) + "," + (j + 1) + "): ");
                m2[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                result[i][j] = 0;
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }

        System.out.println("Resultant matrix after multiplication:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                System.out.print(result[i][j] + "\t");
            }
            System.out.println();
        }
    }
}