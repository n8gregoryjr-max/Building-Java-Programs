package Chapter03.Exercises;

public class Exercise18 {
    public static void main(String[] args) {
        vertical("hey now");
    }

    public static void vertical(String word) {
            // Prints one letter at a time for the length of the String.
        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.charAt(i));
        }
    }
}
/*
Write a method called vertical that accepts a string as its parameter and prints each letter of the string on separate lines.
For example, a call of vertical("hey now") should produce the following output:

    h
    e
    y

    n
    o
    w
 */