package Chapter04.Exercises;

public class Exercise01 {
    void main() {
        IO.print(fractionSum(1));
    }

    public static double fractionSum(int n) {
        double total = 0;
        for (int i = 1; i <= n; i++) {
            total += 1.0 / i;
        }
        return total;
    }
}
/*
Write a method called 'fractionSum' that accepts an integer parameter n and returns as a double the sum of the first n terms of the sequence

    x += 1.0 / i; with i++ and in a loop.

In other words, the method should generate the following sequence:

    1 + 1/2 + 1/3 + 1/4 + 1/5 + ...

You may assume that the parameter n is nonnegative.
 */