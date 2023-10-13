```java
abstract class Shape {
    abstract void numberOfSides();
}

class Rectangle extends Shape {
    @Override
    void numberOfSides() {
        System.out.println("A rectangle has 4 sides.");
    }
}

class Triangle extends Shape {
    @Override
    void numberOfSides() {
        System.out.println("A triangle has 3 sides.");
    }
}

class Hexagon extends Shape {
    @Override
    void numberOfSides() {
        System.out.println("A hexagon has 6 sides.");
    }
}

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Triangle triangle = new Triangle();
        Hexagon hexagon = new Hexagon();

        rectangle.numberOfSides();
        triangle.numberOfSides();
        hexagon.numberOfSides();
    }
}
```

## Sample Algorithm

1. Start Program
2. Create a Rectangle object
3. Call the `numberOfSides` method for the Rectangle object
   - Display "A rectangle has 4 sides."
4. Create a Triangle object
5. Call the `numberOfSides` method for the Triangle object
   - Display "A triangle has 3 sides."
6. Create a Hexagon object
7. Call the `numberOfSides` method for the Hexagon object
   - Display "A hexagon has 6 sides."
8. End Program
