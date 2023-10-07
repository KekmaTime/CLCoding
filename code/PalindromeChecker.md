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
