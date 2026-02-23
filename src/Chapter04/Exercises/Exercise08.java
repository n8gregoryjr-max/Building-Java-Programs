package Chapter04.Exercises;

import java.util.Random;
import java.util.Scanner;

public class Exercise08 {
    void main() {
        IO.print("How many numbers do you want to enter? ");
        smallestLargest(new Scanner(System.in));
    }

    public static void smallestLargest(Scanner input) {
        int reps = input.nextInt();
        int min = -12, max = 12;
        int a, smallest = max, largest = min;
        Random r = new Random();

        for (int i = 1; i <= reps; i++) {

            // Assigns 'a' as a random number.
            a = r.nextInt(min, max);

            // Prints for each repetition.
            IO.println("Number " + i + ": " + a);

            // Changes value if 'a' is larger or smaller.
            if (a < smallest) {
                smallest = a;
            }
            if (a > largest) {
                largest = a;
            }
        }
        // Finishes by showing the smallest and largest values.
        IO.println("Smallest = " + smallest);
        IO.println("Largest = " + largest);
    }
}
/*
Write a method called 'smallestLargest' that accepts a Scanner for the console as a parameter and asks the user to enter numbers,
then prints the smallest and largest of all the numbers supplied by the user.
You may assume that the user enters a valid number greater than 0 for the number of numbers to read.
Here is a sample execution:

    How many numbers do you want to enter? 4
    Number 1: 5
    Number 2: 11
    Number 3: -2
    Number 4: 3
    Smallest = -2
    Largest = 11
 */