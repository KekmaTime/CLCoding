```java
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
```
## Sample Algorithm

1. Start Program
2. Prompt the user to enter the number of rows for matrix 1
3. Read the input for the number of rows for matrix 1
4. Prompt the user to enter the number of columns for matrix 1
5. Read the input for the number of columns for matrix 1
6. Prompt the user to enter the number of rows for matrix 2
7. Read the input for the number of rows for matrix 2
8. Prompt the user to enter the number of columns for matrix 2
9. Read the input for the number of columns for matrix 2
10. Check if matrix multiplication is possible
    1. If cols1 is not equal to rows2
        - Display "Matrix multiplication is not possible"
        - End Program
11. Initialize m1, m2, and result matrices based on input dimensions
12. Prompt the user to enter elements for matrix 1
13. Read the input elements for matrix 1
14. Prompt the user to enter elements for matrix 2
15. Read the input elements for matrix 2
16. Perform matrix multiplication
    1. For each row i in m1
        - For each column j in m2
            1. Initialize result[i][j] to 0
            2. For each element k in a row of m1 or a column of m2
                - Multiply m1[i][k] with m2[k][j] and add to result[i][j]
17. Display the resultant matrix after multiplication
18. End Program