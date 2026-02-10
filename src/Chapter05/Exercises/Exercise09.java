package Chapter05.Exercises;

public class Exercise09 {
    void main() {
        printFactors(24);
    }
    public static void printFactors(int f) {
        if (f < 1) {
            throw new IllegalArgumentException();
        }

        int p;      // Initializing a placeholder num.

        IO.print(1);        // Fence-posting, like the example from the book!
        for (int i = 2; i <= f ; i++) {
            p = f % i;          // Formula to figure out if it divides perfectly.
            if (p == 0) {
                IO.print(" and " + i);
            }
        }
    }
}
/*
Write a method called 'printFactors' that accepts an integer as its parameter and uses a fencepost loop
to print the factors of that number, separated by the word "and".
For example, the factors of the number 24 should print as the following:

    1 and 2 and 3 and 4 and 6 and 8 and 12 and 24

You may assume that the parameter’s value is greater than 0, or you may throw an exception if it is 0 or negative.
 */