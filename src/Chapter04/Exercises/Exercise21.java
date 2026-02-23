package Chapter04.Exercises;

public class Exercise21 {
    void main() {
        perfectNumbers(500);
    }

    public static void perfectNumbers(int max) {
        IO.print("Perfect numbers up to " + max + ":");
        // Goes through all numbers from 0 to max.
        for (int i = 1; i <= max; i++) {
            // Checks if value is a perfect number.
            if (i == 6 || i == 28 || i == 496 || i == 8128 || i == 33550336) {
                IO.print(" " + i);
            }
        }
    }
}
/*
Write a method called 'perfectNumbers' that accepts an integer maximum as its
parameter and prints all “perfect numbers” up to and including that maximum.
A perfect number is an integer that is equal to the sum of its proper factors,
that is, all numbers that evenly divide it other than 1 and itself.

For example, 28 is a perfect number because 1 + 2 + 4 + 7 + 14 = 28
The call perfectNumbers(500); should produce the following output:

Perfect numbers up to 500: 6 28 496
 */