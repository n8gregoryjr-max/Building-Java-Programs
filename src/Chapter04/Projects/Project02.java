package Chapter04.Projects;

import java.util.Scanner;

public class Project02 {

    void main() {
        dateFinder(new Scanner(System.in));
    }

    public static void dateFinder(Scanner input) {
        // Prompts user for date and stores each response.
        IO.println("Provide a date in month, day, year format (like \"01  01  1601\").");
        int month = input.nextInt(), day = input.nextInt(), year = input.nextInt(), total = 0;

        // Converts the full date into total days.
        total += yearCalc(year);
        total += monthCalc(month, year);
        total += dayCalc(day);

        // Uses total days to tell the day of the week.
        dayOfTheWeek(total);
    }

    public static int yearCalc(int years){
        // Checks for invalid numbers.
        if (years < 1) {
            throw new IllegalArgumentException();
        }

        // Initializes day counter.
        int total = 0;

        // Goes through each full year before the target year.
        for (int i = 1; i < years; i++) {
            // Adds a day for each leap year.
            if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) {
                total += 1;
            }

            // Adds a year's worth of days to the counter.
            total += 365;
        }

        // Returns total amount of days.
        return total;
    }

    public static int monthCalc(int months, int year) {
        // Checks for invalid numbers.
        if (months < 1 || months > 12) {
            throw new IllegalArgumentException();
        }

        // Initializes day counter.
        int total = 0;
        // Checks if said year is a leap year.
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;

        // Goes through each month before the target month.
        for (int i = 1; i < months; i++) {
            // Adds the correct number of days for each completed month.
            if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10) {
                total += 31;
            }
            if (i == 4 || i == 6 || i == 9 || i == 11) {
                total += 30;
            }
            if (i == 2) {
                total += 28;
                // Adds 1 if THIS YEAR is a leap year.
                if (isLeapYear) {
                    total += 1;
                }
            }
        }

        // Returns total days.
        return total;
    }

    public static int dayCalc(int days) {
        // Checks for obviously invalid day values.
        if (days < 1 || days > 31) {
            throw new IllegalArgumentException();
        }

        // Subtracts 1 so the first day of the month adds 0 extra days.
        return days - 1;
    }

    public static void dayOfTheWeek(int totalDays) {
        // Reduces total days to a weekday index.
        int day = totalDays % 7;

        // Uses value to index what day it would be.
        if (day == 0) {
            IO.print("Monday");
        } else if (day == 1) {
            IO.print("Tuesday");
        } else if (day == 2) {
            IO.print("Wednesday");
        } else if (day == 3) {
            IO.print("Thursday");
        } else if (day == 4) {
            IO.print("Friday");
        } else if (day == 5) {
            IO.print("Saturday");
        } else if (day == 6) {
            IO.print("Sunday");
        }
    }
}
/*
Write a program that prompts for a date (month, day, year) and reports the day of the week for that date.
It might be helpful to know that January 1, 1601, was a Monday.
 */