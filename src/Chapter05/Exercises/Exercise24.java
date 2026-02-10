package Chapter05.Exercises;

public class Exercise24 {
    void main() {
        if (isAllVowels("eIEiO")) {
            IO.print("True");
        } else {
            IO.print("False");
        }
    }

    public static boolean isAllVowels(String word) {
            // Checks for errors.
        if (word == null) {
            throw new IllegalArgumentException();
        }

            // Sets word to lowercase.
        word = word.toLowerCase();

            // Runs loop for each character in string.
        for (int i = 0; i < word.length(); i++) {
            char a = word.charAt(i);

                // Checks if each character are vowels
            if (a != 'a' && a != 'e' && a != 'i' && a != 'o' && a != 'u') {
                    // Changes to false char is not a vowel.
                return false;
            }
        }
        return true;
    }
}
/*
Write a method called 'isAllVowels' that returns whether a string consists entirely of vowels (a, e, i, o, or u, case-insensitively).
If and only if every character of the string is a vowel, your method should return true.
For example, the call isAllVowels("eIEiO") returns true and isAllVowels("oink") returns false.
You should return true if passed the empty string, since it does not contain any non-vowel characters.
 */