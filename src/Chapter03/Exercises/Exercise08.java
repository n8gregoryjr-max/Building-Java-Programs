package Chapter03.Exercises;

public class Exercise08 {
    public static void main(String[] args) {
        quadratic(1, -7, 12);
    }

    public static void quadratic(double a, double b, double c){
            // Start by solving for the part that is constant in both roots.
        double partOne = b * b - 4 * a * c;
        double partTwo = Math.sqrt(partOne);
            // Solve for roots.
        double root1 = (partTwo - b) / (2 * a);
        double root2 = (partTwo + b) / (2 * a);

            // Prints roots as doubles. I could change them to int if we expected numbers that would result as integers.
        System.out.print("x = " + root1 + ", x = " + root2);
    }
}
/*
Write a method called quadratic that solves quadratic equations and prints their roots.
Recall that a quadratic equation is a polynomial equation in terms of a variable 𝑥 of the form 𝑎x^2 + 𝑏𝑥 + 𝑐 = 0.
The formula for solving a quadratic equation is:

    𝑥 = (-𝑏 +/- sqrt(𝑏^2 - 4𝑎𝑐))/2𝑎.

Here are some example equations and their roots:

    𝑥^2 - 7𝑥 + 12 : 𝑥 = 4, 𝑥 = 3
    𝑥 - 3𝑥 + 2 : x = -2, x = -1

Your method should accept the coefficients 𝑎, 𝑏, and 𝑐 as parameters and should print the roots of the equation.
You may assume that the equation has two real roots, though mathematically this is not always the case.
 */