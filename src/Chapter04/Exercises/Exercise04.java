package Chapter04.Exercises;

public class Exercise04 {
    void main() {
        IO.print(daysInMonth(1));
    }

   public static int daysInMonth(int m) {
        if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
            return 31;
        } else if (m == 4 || m == 6 || m == 9 || m == 11) {
            return 30;
        } else if (m == 2) {
            return 28;
        } else {
            throw new IllegalArgumentException("Needs to be a number between 1 and 12.");
        }

   }
}
/*
Write a method called 'daysInMonth' that takes a month (an integer between 1 and 12) as a parameter and returns the number of days in that month in this year.
For example, the call daysInMonth(9) would return 30 because September has 30 days.
Assume that the code is not being run during a leap year (that February always has 28 days).
The following table lists the number of days in each month:

    Month	1 Jan	2 Feb	3 Mar	4 Apr	5 May	6 Jun	7 Jul	8 Aug	9 Sep	10 Oct	11 Nov	12 Dec
    Days	31	    28	    31	    30	    31	    30	    31	    31	    30	    31	    30	    31
 */