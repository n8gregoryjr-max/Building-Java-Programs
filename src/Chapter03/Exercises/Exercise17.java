package Chapter03.Exercises;

public class Exercise17 {
    public static void main(String[] args) {
        padString("Frog", 10);
    }

    public static String padString(String word, int pad) {
        String padding = "";
        int length = word.length();
        pad = pad - length;
        for (int i = 0; i < pad; i++) {
            padding = (padding + " ");
        }
        word = word + padding;
        System.out.print(word);
        return word;
    }
}
/*
Write a method called padString that accepts two parameters: a string and an integer representing a length.
The method should pad the parameter string with spaces until its length is the given length.
For example, padString("hello", 8) should return "hello ". (This sort of method is useful when trying to print output that lines up horizontally.)
If the string’s length is already at least as long as the length parameter, your method should return the original string.
For example, padString("congratulations", 10) should return "congratulations".
 */