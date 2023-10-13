```java
import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        int sum = calculateSumOfDigits(number);

        System.out.println("Sum of digits: " + sum);
    }

    public static int calculateSumOfDigits(int number) {
        int sum = 0;
        while (number != 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }
        return sum;
    }
}
```

## Sample Algorithm

1. Start Program
2. Prompt the user to enter an integer
3. Read the input integer
4. Initialize sum variable to 0
5. Loop until the input integer is not 0
   1. Get the last digit of the input integer
   2. Add the last digit to the sum
   3. Remove the last digit from the input integer
6. Display the sum of digits
7. End Program
