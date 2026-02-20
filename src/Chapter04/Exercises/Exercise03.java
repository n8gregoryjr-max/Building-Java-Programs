package Chapter04.Exercises;

public class Exercise03 {
    void main() {
        IO.print(season(12, 1));
    }

    public static String season(int a, int b) {
        if ((a == 12 && b > 15) || a == 1 || a == 2 || (a == 3 && b < 16)) {
            return "winter";
        } else if ((a == 3 && b > 15) || a == 4 || a == 5 || (a == 6 && b < 16)) {
            return "spring";
        } else if ((a == 6 && b > 15) || a == 7 || a == 8 || (a == 9 && b < 16)) {
            return "summer";
        } else {
            return "fall";
        }
    }
}
/*
Write a method called 'season' that takes as parameters two integers representing a month and day and returns a String indicating the season
for that month and day. Assume that the month is specified as an integer between 1 and 12 (1 for January, 2 for February, and so on) and
that the day of the month is a number between 1 and 31.
If the date falls between 12/16 and 3/15, the method should return "winter".
If the date falls between 3/16 and 6/15, the method should return "spring".
If the date falls between 6/16 and 9/15, the method should return "summer".
And if the date falls between 9/16 and 12/15, the method should return "fall".
 */