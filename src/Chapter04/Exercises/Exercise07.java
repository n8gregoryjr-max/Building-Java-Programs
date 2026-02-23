package Chapter04.Exercises;

public class Exercise07 {
    void main() {
        xo(12);
    }

    public static void xo(int size) {
        // Sets the max outer limit to half (rounded down) the size.
        int max = size/2;

        for (int i = 0; i < size; i++) {
            outerLayer(i, max, size);
            IO.print("x");
            innerLayer(i, max, size);

            boolean isOdd = size % 2 == 1;
            boolean isMiddleRow = i == max;
            // Gets rid of second x in odd number's middle point.
            if (!isOdd || !isMiddleRow) {
                IO.print("x");
            }

            outerLayer(i, max, size);
            IO.println();
        }
    }

    public static void outerLayer(int i, int max, int size) {
        if (i < max) {
            for (int j = 0; j < i; j++) {
                IO.print("o");
            }
        } else if (size % 2 == 0 && i == max) {
            for (int j = 0; j < max - 1; j++) {
                IO.print("o");
            }
        } else {
            for (int j = 0; j < size - i - 1; j++) {
                IO.print("o");
            }
        }
    }

    public static void innerLayer(int i, int max, int size) {
        int inner1 = size - 2 - (2 * i);
        int inner2 = (2 * i) - size;

        if (i <= max) {
            for (int j = 0; j < inner1; j++) {
                IO.print("o");
            }
        } else {
            for (int j = 0; j < inner2; j++) {
                IO.print("o");
            }
        }
    }
}
/*
Write a static method called 'xo' that accepts an integer size as a parameter and prints a square of size by size characters,
where all characters are “o” except that an “x” pattern of “x” characters has been drawn from the corners of the square.
On the first line, the first and last characters are “x”; on the second line, the second and second-from-last characters are “x”; and so on.

Here are two example outputs:

    xo(5);	    xo(6);
    xooox	    xoooox
    oxoxo	    oxooxo
    ooxoo	    ooxxoo
    oxoxo	    ooxxoo
    xooox	    oxooxo
                xoooox
 */