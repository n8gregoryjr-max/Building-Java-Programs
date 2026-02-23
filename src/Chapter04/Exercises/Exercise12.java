package Chapter04.Exercises;

public class Exercise12 {
    void main() {
        printTriangleType(5, 7, 7);
        printTriangleType(6, 6, 6);
        printTriangleType(5, 7, 8);
        printTriangleType(2, 18, 2);
    }

    public static void printTriangleType(int a, int b, int c) {
        // Checks for triangle inequality.
        if(!(a + b > c && a + c > b && b + c > a)) {
            throw new IllegalArgumentException();
        }

        // Checks for type of triangle.
        if (a == b && b == c) {
            IO.println("equilateral");
        } else if (a == b || b == c || a == c) {
            IO.println("isosceles");
        } else {
            IO.println("scalene");
        }
    }
}
/*
Write the method called printTriangleType referred to in Self-Check Problem 25.
This method accepts three integer arguments representing the lengths of the sides of a triangle and prints the type
of triangle that these sides form.

Here are some sample calls to printTriangleType:

    printTriangleType(5, 7, 7);
    printTriangleType(6, 6, 6);
    printTriangleType(5, 7, 8);
    printTriangleType(2, 18, 2);

The output produced by these calls should be

    isosceles
    equilateral
    scalene
    isosceles

Your method should throw an IllegalArgumentException if passed invalid values, such as ones where one side’s length
is longer than the sum of the other two, which is impossible in a triangle.
For example, the call of printTriangleType(2, 18, 2); should throw an exception.
 */