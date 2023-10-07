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