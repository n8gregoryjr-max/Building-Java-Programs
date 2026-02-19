package Chapter03.Projects;

import java.util.Scanner;

public class Project04 {
    void main() {
        promptUser(new Scanner(System.in));
    }

    public static void promptUser(Scanner input) {
        IO.println("Give me the three sides of a right triangle.");
        double a = input.nextInt();
        double b = input.nextInt();
        double c = input.nextInt();
        if(a * a + b * b == c * c) {
            double angle1 = Math.toDegrees(Math.asin(b/c));
            double angle2 = 90 - angle1;

            IO.print("Here are the three angles of the right triangle:" +
                    angle1 + ", " + angle2 + ", and 90");
        } else {
            throw new IllegalArgumentException("Not a right triangle.");
        }
    }
}
/*
Write a program that prompts for the lengths of the sides of a triangle and reports the three angles.
 */