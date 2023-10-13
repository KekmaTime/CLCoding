```java
import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = scanner.nextLine();

        int result = isPalindrome(s);

        if (result == 1) {
            System.out.println(s + " is a palindrome.");
        } else {
            System.out.println(s + " is not a palindrome.");
        }
    }

    public static int isPalindrome(String s) {
        String a = s.toLowerCase();
        int length = a.length();

        if (length <= 1) {
            return 1;
        }
        for (int i = 0; i < length / 2; i++) {
            if (a.charAt(i) != a.charAt(length - 1 - i)) {
                return -1;
            }
        }
        return 1;
    }
}
```

## Sample Algorithm

1. Start Program
2. Prompt the user to enter a string
3. Read the input string
4. Convert the input string to lowercase
5. Calculate the length of the string
6. Check if the length is less than or equal to 1
   1. If true, the string is a palindrome (return 1)
   2. If false, proceed to the loop
7. Initialize a variable `i` to 0
8. Check if `i` is less than half of the length of the string
   1. If true, compare characters at positions `i` and `length - 1 - i`
      1. If characters are not equal, the string is not a palindrome (return -1)
      2. If characters are equal, continue comparing with the next set of characters
   2. If false, the string is a palindrome (return 1)
9. Check the result of the palindrome check
   1. If the result is 1, display "String is a palindrome"
   2. If the result is -1, display "String is not a palindrome"
10. End Program