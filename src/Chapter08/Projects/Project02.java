package Chapter08.Projects;

public class Project02 {

}
/*
Write a class called Date that represents a date consisting of a year, month, and day.
A Date object should have the following methods:

    public Date(int year, int month, int day)

Constructs a new Date object to represent the given date.

    public void addDays(int days)

Moves this Date object forward in time by the given number of days.

    public void addWeeks(int weeks)

Moves this Date object forward in time by the given number of seven-day weeks.

    public int daysTo(Date other)

Returns the number of days that this Date must be adjusted to make it equal to the given other Date.

    public int getDay()

Returns the day value of this date; for example, for the date 2006/07/22, returns 22.

    public int getMonth()

Returns the month value of this date; for example, for the date 2006/07/22, returns 7.

    public int getYear()

Returns the year value of this date; for example, for the date 2006/07/22, returns 2006.

    public boolean isLeapYear()

Returns true if the year of this date is a leap year.
A leap year occurs every four years, except for multiples of 100 that are not multiples of 400.
For example, 1956, 1844, 1600, and 2000 are leap years, but 1983, 2002, 1700, and 1900 are not.

    public String toString()

Returns a String representation of this date in year/month/day order, such as "2006/07/22".
 */