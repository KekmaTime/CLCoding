```java
import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int isPrime = isPrimeNumber(num);
        if (isPrime != num) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }

    public static int isPrimeNumber(int number) {
        if (number <= 1) {
            return -1;
        }
        for (int i = 2; i <= number/2; i++) {
            if (number % i == 0) {
                return number;
            }
        }

        return -1;
    }
}
```
