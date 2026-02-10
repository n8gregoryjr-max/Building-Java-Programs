package Chapter05.Projects;

import java.util.Scanner;

public class Project01 {
    void main() {
        pigLatin(new Scanner(System.in));   // Initializing scanner.
    }

    public static void pigLatin(Scanner input) {
            // Initializing final answer.
        String result = "";

            // Introduction and prompts user for a sentence.
        IO.print("Thank you for using this English to Pig Latin tool!\n" +
                "Enter a sentence: ");
        String sentence = input.nextLine();

            // Breaks scanner into bite sized pieces.
        Scanner words = new Scanner(sentence);

            // Loops the translation for each word and adds it to the placeholder String.
        while (words.hasNext()) {
            String word = words.next();
            result += translation(word) + " ";
        }

            // Outputs final result, minus any spaces before or after.
        System.out.println(result.trim());
    }

    public static String translation(String word) {
        char first = word.charAt(0);
            // Check for one-letter words.
        if (word.length() != 1 && first != 'a' && first != 'A' && first != 'e' &&
                first != 'E' && first != 'i' && first != 'I' && first != 'o' &&
                first != 'O' && first != 'u' && first != 'U') {
                // Grabs second character.
            char second = word.charAt(1);
                // Checks if it is a Th, Wh, Bl, or any of those.
            if (second == 'h' || second == 'l') {
                return (word.substring(2) + "-" + first + second + "ay");

            } else {
                return (word.substring(1) + "-" + first + "ay");
            }
        }
        return (word + "-ay");
    }
}
/*
Write an interactive program that reads lines of input from the user and converts each line into “Pig Latin.”
Pig Latin is English with the initial consonant sound moved to the end of each word, followed by “ay.”
Words that begin with vowels simply have an “ay” appended.
For example, the phrase

    The deepest shade of mushroom blue

would have the following appearance in Pig Latin:

    e-Thay eepest-day ade-shay of-ay ushroom-may ue-blay

Terminate the program when the user types a blank line.
 */