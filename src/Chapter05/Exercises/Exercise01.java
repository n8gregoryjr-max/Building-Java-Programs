package Chapter05.Exercises;

public class Exercise01 {
    void main() {
        showTwos(7);
        showTwos(18);
        showTwos(68);
        showTwos(120);
    }

    public static void showTwos(int num) {
        // Prints initial number.
        IO.print(num + " = ");
        // If it is divisible by 2, divides by two until it is not able to.
        while(num % 2 == 0) {
            num /= 2;
            IO.print("2 * ");
        }
        // Prints remaining number.
        IO.println(num);
    }
}
/*
Write a method called 'showTwos' that shows the factors of 2 in a given integer.
For example, consider the following calls:

    showTwos(7);
    showTwos(18);
    showTwos(68);
    showTwos(120);

These calls should produce the following output:

    7 = 7
    18 = 2 * 9
    68 = 2 * 2 * 17
    120 = 2 * 2 * 2 * 15

 */