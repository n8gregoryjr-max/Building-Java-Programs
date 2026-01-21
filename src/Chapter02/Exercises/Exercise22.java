package Chapter02.Exercises;

public class Exercise22 {
    public static final int HEIGHT = 7;

    public static void main(String[] args) {
        for (int x = 1; x <= HEIGHT; x++) {
            int sideStar = ((x - 1) * 2);
            int dollarSign = HEIGHT - x + 1;
            int middleStar = ((HEIGHT - x) * 2) + 1;

            for (int i = 1; i <= sideStar; i++) {
                System.out.print("*");
            }

            for (int i = 1; i <= dollarSign; i++) {
                System.out.print("$");
            }

            for (int i = 0; i <= middleStar; i++) {
                System.out.print("*");
            }

            for (int i = 1; i <= dollarSign; i++) {
                System.out.print("$");
            }

            for (int i = 1; i <= sideStar; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/*
Write a Java program called DollarFigure that produces the following output.
Use nested for loops to capture the structure of the figure.

$$$$$$$**************$$$$$$$
**$$$$$$************$$$$$$**
****$$$$$**********$$$$$****
******$$$$********$$$$******
********$$$******$$$********
**********$$****$$**********
************$**$************

My logic on how to solve this:
_______________
1| 0 7 14 7 0
2| 2 6 12 6 2
3| 4 5 10 5 4
4| 6 4  8 4 6
5| 8 3  6 3 8
6|10 2  4 2 10
7|12 1  3 1 12

There are 5 loops, with loop 1-5 and 2-4 being the same, so there are really 3 loops.
loop one is always 0 at the start, so matter the height, so ((x - 1) * 2).
loop two is equal to the height and goes down by one, so (x - i + 1).
loop three is twice the height and does down by 2 each time, so ((2 * x) - (2 * i)).
loop four and five will mimic two and one.

 */