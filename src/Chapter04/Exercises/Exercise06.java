package Chapter04.Exercises;

public class Exercise06 {
    void main() {
        printRange(-1, 11);
    }

    public static void printRange(int a, int b) {
        // Obtains the difference between the numbers.
        int range = Math.abs(a - b);

        // In the case both if-else are false, still prints first number.
        IO.print(a + " ");

        // Prints numbers going up to b if it is greater
        if (a < b) {
            for (int i = 1; i <= range; i++) {
                IO.print((a + i) + " ");
            }

            // Prints numbers going down to b if it is lesser
        } else if (b < a) {
            for (int i = 1; i <= range; i++) {
                IO.print((a - i) + " ");
            }
        }
    }
}
/*
Write a method called 'printRange' that accepts two integers as arguments and prints the sequence of numbers between the two arguments, separated by spaces.
Print an increasing sequence if the first argument is smaller than the second; otherwise, print a decreasing sequence.
If the two numbers are the same, that number should be printed by itself. Here are some sample calls to printRange:

    printRange(2, 7);
    printRange(19, 11);
    printRange(5, 5);

The output produced from these calls should be the following sequences of numbers:

    2 3 4 5 6 7
    19 18 17 16 15 14 13 12 11
    5

 */