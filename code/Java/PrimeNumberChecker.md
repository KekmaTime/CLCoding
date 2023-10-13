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
## Sample Algorithm

1. Start Program
2. Prompt the user to enter a number
3. Read the input number
4. Call the function `isPrimeNumber` with the input number as an argument
5. Initialize a variable `i` to 2
6. Check if `i` is less than or equal to half of the input number
   1. If true, check if the input number is divisible by `i`
      1. If true, the number is not prime
      2. If false, continue checking with the next value of `i`
   2. If false, the number is prime
7. Check the result of the prime number check
   1. If the result is not equal to the input number, display "Number is a prime number"
   2. If the result is equal to the input number, display "Number is not a prime number"
8. End Program
