package Chapter04.Exercises;

import java.util.Scanner;

public class Exercise10 {
    void main() {
        printGPA(new Scanner(System.in));
    }

    public static void printGPA(Scanner input) {
        // Prompts user to enter a student's record and turns it into a string.
        IO.print("Enter a student record: ");
        String record = input.nextLine();

        // Turns string into a scanner.
        Scanner rec = new Scanner(record);

        // First word is made into name, first int is turned into amount of reps.
        String name = rec.next();
        int reps = rec.nextInt();

        // Initializes final answer.
        double total = 0;

        // Adds the rest of the values in the string.
        for (int i = 0; i < reps; i++) {
            total += rec.nextDouble();
        }

        // Divides all values by reps for an average value.
        total /= reps;

        // Final output.
        IO.print(name + "'s grade is " + total);
    }
}
/*
Write a method called 'printGPA' that accepts a Scanner for the console as a parameter and calculates a student’s grade point average.
The user will type a line of input containing the student’s name, then a number that represents the number of scores,
followed by that many integer scores.

Here are two example dialogues:

    Enter a student record: Maria 5 72 91 84 89 78
    Maria's grade is 82.8

    Enter a student record: Jordan 4 86 71 62 90
    Jordan's grade is 77.25

Maria's grade is 82.8 because her average of (72 + 91 + 84 + 89 + 78)/5 equals 82.8
 */