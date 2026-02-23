package Chapter04.Exercises;

public class Exercise17 {
    void main() {
        IO.print(stutter("Hello!"));
    }

    public static String stutter(String word) {
        String answer = "";
        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < 2; j++) {
                answer += word.charAt(i);
            }
        }
        return answer;
    }
}
/*
Write a method called 'stutter' that accepts a string parameter and returns that string with its characters repeated twice.
For example, stutter("Hello!") returns "HHeelllloo!!"
 */