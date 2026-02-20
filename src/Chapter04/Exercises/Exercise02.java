package Chapter04.Exercises;

public class Exercise02 {
    void main() {
        IO.print(repl("hello", 3));
    }

    public static String repl(String a, int reps) {
        String ans = "";
        if (reps > 0) {
            for (int i = 0; i < reps; i++) {
                ans += a;
            }
            return ans;
        } else {
            return "";
        }
    }
}
/*
Write a method called 'repl' that accepts a String and a number of repetitions as parameters and returns the String concatenated that many times.
For example, the call repl("hello", 3) should return "hellohellohello".
If the number of repetitions is zero or less, the method should return an empty string.
 */