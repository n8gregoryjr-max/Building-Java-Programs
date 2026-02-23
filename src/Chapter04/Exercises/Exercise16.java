package Chapter04.Exercises;

import java.util.Scanner;

public class Exercise16 {
    void main() {
        printPalindrome(new Scanner(System.in));
    }

    public static void printPalindrome(Scanner input) {
        IO.print("How many words will you be testing? ");
        int reps = input.nextInt();

        for (int i = 0; i < reps; i++) {
            IO.print("Enter a word: ");
            String word = input.next();

            String compare = "";
            for (int j = 0; j < word.length(); j++) {
                compare += word.charAt(word.length() - j - 1);
            }

            if (compare.equals(word)) {
                IO.println(word + " is a Palindrome!");
            } else {
                IO.println(word + " is NOT a Palindrome.");
            }
        }
    }
}
/*
Write a method called 'printPalindrome' that accepts a Scanner for the console as a parameter,
prompts the user to enter one or more words, and prints whether the entered String is a palindrome
(i.e., reads the same forward as it does backward, like "abba" or "racecar").
 */