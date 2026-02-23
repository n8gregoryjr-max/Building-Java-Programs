package Chapter04.Exercises;

public class Exercise15 {
    void main() {
        IO.print(getGrade(96));
    }

    public static double getGrade(int g) {
        if (g < 0 || g > 100) {
            throw new IllegalArgumentException("Number is outside of range: 0-100");
        }

        if (g < 60) {
            return 0.0;
        } else if (g < 63) {
            return 0.7;
        } else if (g >= 95) {
            return 4.0;
        } else {
            return (g - 55) / 10.0;
        }
    }
}
/*
Write a method called 'getGrade' that accepts an integer representing a student’s grade in a course and returns that student’s numerical course grade.
The grade can be between 0.0 (failing) and 4.0 (perfect).
Assume that scores are in the range of 0 to 100 and that grades are based on the following scale:

    Score	Grade
    <60	    0.0
    60–62	0.7
    63	    0.8
    64	    0.9
    65	    1.0
    ...	    ...
    92	    3.7
    93	    3.8
    94	    3.9
    >= 95	4.0

For an added challenge, make your method throw an IllegalArgumentException if the user passes a grade lower than 0 or higher than 100.
 */