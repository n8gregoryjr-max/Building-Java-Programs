package Chapter04.Exercises;

public class Exercise18 {
    void main() {
        IO.print(wordCount(" hello "));
    }

    public static int wordCount(String words) {
            // Pre-checks for Errors before running code.
        if (words == null) {
            throw new IllegalArgumentException();
        }

            // Holds value equal to number of words.
        int wordCount = 0;

            // This is a toggle to see if we are in a word.
        boolean word = false;

            // Looks at every character in order.
        for (int i = 0; i < words.length(); i++) {
            char c = words.charAt(i);

                // If the character is not a space and starts a new word, toggle true and add 1 to word counter.
            if (c != ' ') {
                if (!word) {
                    wordCount++;
                    word = true;
                }

                // If the character is a space, then toggle off to either repeat cycle or return word counter.
            } else {
                word = false;
            }
        }

        return wordCount;
    }
}
/*
Write a method called 'wordCount' that accepts a String as its parameter and returns the number of words in the String.
A word is a sequence of one or more nonspace characters (any character other than ' ').
For example, the call wordCount("hello") should return 1, the call wordCount("how are you?") should return 3,
the call wordCount(" this string has wide spaces ") should return 5, and the call wordCount(" ") should return 0.
 */