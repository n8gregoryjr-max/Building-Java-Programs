package Chapter05.Exercises;

public class Exercise18 {
    void main() {
        int a = digitSum(0);
        IO.print(a);
    }

    public static int digitSum(int num) {
            // Initialize final value.
        int sum = 0;

            // Change input to a positive number.
        num = Math.abs(num);

            // Loop for as many digits are in a number.
        while (num != 0) {

                // Add digit to sum for each digit there is.
            sum += (num % 10);

                // Move onto the next digit.
            num = num / 10;
        }
            // Print sum of all digits.
        return sum;
    }
}
/*
Write a method called 'digitSum' that accepts an integer as a parameter and returns the sum of the digits of that number.
For example, the call digitSum(29107) returns 2 + 9 + 1 + 0 + 7, or 19.
For negative numbers, return the same value that would result if the number were positive.
For example, digitSum(-456) returns 4 + 5 + 6, or 15.
The call digitSum(0) returns 0.
 */