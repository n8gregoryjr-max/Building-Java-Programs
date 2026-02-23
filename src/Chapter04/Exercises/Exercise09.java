package Chapter04.Exercises;

import java.util.Scanner;

public class Exercise09 {
    void main() {
        IO.print("How many integers? ");
        evenSumMax(new Scanner(System.in));
    }

    public static void evenSumMax(Scanner input) {
        // Prompts the user for amount of numbers being input.
        int reps = input.nextInt();

        // Initialize and define final output values and a placeholder value.
        int evenMax = 0, evenSum = 0, a;

        for (int i = 0; i < reps; i++) {
            IO.print("Next integer? ");
            a = input.nextInt();
            if (a > evenMax && a % 2 == 0) {
                evenMax = a;
            }
            if (a % 2 == 0) {
                evenSum += a;
            }
        }


        IO.print("Even sum = " + evenSum + ", Even max = " + evenMax);
    }
}
/*
Write a method called 'evenSumMax' that accepts a Scanner for the console as a parameter.
The method should prompt the user for a number of integers, then prompt the integer that many times.
Once the user has entered all the integers, the method should print the sum of all the even numbers the user typed,
along with the largest even number typed. You may assume that the user will type at least one nonnegative even integer.

Here is an example dialogue:

    How many integers? 4
    Next integer? 2
    Next integer? 9
    Next integer? 18
    Next integer? 4
    Even sum = 24, Even max = 18

 */