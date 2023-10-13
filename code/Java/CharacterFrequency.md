```java
import java.util.Scanner;

public class CharacterFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = scanner.nextLine();

        System.out.print("Enter a character to find its frequency: ");
        char a = scanner.next().charAt(0);
        int freq = frequencyChecker(s, a);
        System.out.println("Frequency of '" + a + "' in the string: " + freq);
    }

    public static int frequencyChecker(String s, char a) {
        int f = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == a) {
                f++;
            }
        }
        return f;
    }
}
``````

## Sample Algorithm

1. Start Program
2. Prompt the user to enter a string
3. Read the input string
4. Prompt the user to enter a character to find its frequency
5. Read the input character
6. Call `frequencyChecker` with the input string and character as arguments
7. Initialize a frequency variable to 0
8. Iterate over each character in the input string
   - If the current character matches the input character, increment the frequency
9. Return the frequency
10. Display the frequency of the input character in the string
11. End Program
