```java
import java.util.Scanner;

class ShapeCalculator {
    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static double calculateArea(double length, double width) {
        return length * width;
    }

    public static double calculateArea(int base, int height) {
        return 0.5 * base * height;
    }
}

public class AreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String choice;
        do {
            System.out.println("Choose a shape to calculate area:");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Triangle");
            System.out.print("Enter your choice: ");
            int shape = scanner.nextInt();

            double area = 0.0;

            switch (shape) {
                case 1:
                    System.out.print("Enter the radius of the circle: ");
                    double radius = scanner.nextDouble();
                    area = ShapeCalculator.calculateArea(radius);
                    break;

                case 2:
                    System.out.print("Enter the length of the rectangle: ");
                    double length = scanner.nextDouble();
                    System.out.print("Enter the width of the rectangle: ");
                    double width = scanner.nextDouble();
                    area = ShapeCalculator.calculateArea(length, width);
                    break;

                case 3:
                    System.out.print("Enter the base of the triangle: ");
                    double base = scanner.nextInt();
                    System.out.print("Enter the height of the triangle: ");
                    double height = scanner.nextInt();
                    area = ShapeCalculator.calculateArea(base, height);
                    break;

                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }

            System.out.println("Area: " + area);

            // Ask if the user wants to continue
            System.out.print("Do you want to calculate another area? (yes/no): ");
            choice = scanner.next().toLowerCase();

        } while (choice.equals("yes"));

        scanner.close();
    }
}
```
## Sample Algorithm

1. Start Program
2. Create a Scanner object to read user input
3. Display shape options to calculate area
4. Prompt the user to choose a shape
5. Read the user's shape choice
6. Initialize area variable to 0.0
7. Based on the user's choice, calculate the area using `ShapeCalculator`
8. Display the calculated area
9. Ask if the user wants to calculate the area for another shape
   - If yes, repeat steps 3-8
   - If no, continue to the next step
10. Close the Scanner
11. End Program