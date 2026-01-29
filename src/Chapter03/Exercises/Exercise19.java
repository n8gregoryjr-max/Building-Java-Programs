package Chapter03.Exercises;

public class Exercise19 {
    public static void main(String[] args) {
        printReverse("hello there!");
    }

    public static void printReverse(String word) {
            // Prints string backwards by indexing from length down to 0.
        for (int i = 1; i <= word.length(); i++) {
            int reverse = word.length() - i;
            System.out.print(word.charAt(reverse));
        }
    }
}
/*
Write a method called printReverse that accepts a string as its parameter and prints the characters in opposite order.
For example, a call of printReverse("hello there!") should print "!ereht olleh".
If the empty string is passed, the method should produce no output.
 */