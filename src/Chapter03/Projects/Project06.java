package Chapter03.Projects;

public class Project06 {
}
/*
Write a program that produces calendars as output. Your program should have a method that outputs a single month’s calendar like the one below,
given parameters to specify how many days are in the month and what the date of the first Sunday is in that month.
In the month shown below, these values are 31 and 6, respectively.

      Sun    Mon    Tue    Wed    Thu    Fri    Sat
    +------+------+------+------+------+------+------+
    |      |      |   1  |   2  |   3  |   4  |   5  |
    |   6  |   7  |   8  |   9  |  10  |  11  |  12  |
    |  13  |  14  |  15  |  16  |  17  |  18  |  19  |
    |  20  |  21  |  22  |  23  |  24  |  25  |  26  |
    |  27  |  28  |  29  |  30  |  31  |      |      |
    +------+------+------+------+------+------+------+

One tricky part of this program is making the various columns line up properly with proper widths.
We will learn better ways of formatting output in the next chapter.
For now, you may copy the following 'helper' method into your program and call it to turn a number into a left-padded string of a given exact width.
For example, the call System.out.print(padded(7, 5)); prints " 7" (the number 7 with four leading spaces).

    // Returns a string of the number n, left-padded
    // with spaces until it is at least the given width.
    public static String padded(int n, int width) {
        String s = "" + n;
        for (int i = s.length(); i < width; i++) {
            s = " " + s;
        }
        return s;
    }

 */