package Chapter04.Projects;

import java.util.Scanner;

public class Project04 {
    void main() {
        getBirthdays();
    }

    public static void getBirthdays() {
        // Initializes Scanner to pass around.
        Scanner userPrompt = new Scanner(System.in);

        // Tool info.
        IO.println("Birthday Comparison Tool:" +
                "\n(Please enter in a \"MM DD\" format)");

        // Stores date in absolute day form for easy comparison.
        int today = absoluteDayCalc(userPrompt, 0);
        int person1 = absoluteDayCalc(userPrompt, 1);
        int person2 = absoluteDayCalc(userPrompt, 2);

        // Gives info based on their birthdays.
        compareBirthdays(today, person1, person2);
    }

    // Converts a date into it's absolute day value.
    public static int absoluteDayCalc(Scanner input, int type) {
        // Different prompt based on 'int type'.
        if (type == 0) {
            IO.print("\nWhat is today's date? ");
        } else {
            IO.print("Enter person " + type + "'s birthday: ");
        }

        // Stores values entered.
        int month = input.nextInt();
        int day = input.nextInt();

        // Checks for invalid numbers (basic validation).
        if (month < 1 || month > 12 || day < 1 || day > 31) {
            throw new IllegalArgumentException();
        }

        // Converts months to days.
        for (int i = 1; i < month; i++) {
            day = getDay(day, i);
        }

        return day;
    }

    public static int getDay(int day, int i) {
        if (i == 1 || i == 3 || i == 5 ||
                i == 7 || i == 8 || i == 10) {
            day += 31;
        }
        if (i == 4 || i == 6 || i == 9 || i == 11) {
            day += 30;
        }
        if (i == 2) {
            day += 28;
        }
        return day;
    }

    public static void compareBirthdays(int today, int person1, int person2) {
        // Make days relative based on "today."
        person1 = relativeDayCalc(today, person1);
        person2 = relativeDayCalc(today, person2);

        // Shares relative birthday info.
        IO.println("\nPerson 1's birthday is in " + person1 + " day(s)." +
                "\nPerson 2's birthday is in " + person2 + " day(s).");

        // Shares whose birthday is sooner.
        if (person1 < person2) {
            IO.println("\nIt looks like Person 1's birthday is sooner!");
        } else if (person2 < person1) {
            IO.println("\nIt looks like Person 2's birthday is sooner!");
        } else {
            IO.println("\nBoth birthdays are the same number of days away.");
        }
    }

    public static int relativeDayCalc(int today, int person) {
        person -= today;
        if (person >= 0) {
            return person;
        } else {
            return person + 365;
        }
    }
}
/*
Write a program that prompts for two people’s birthdays (month and day), along with today’s month and day.
The program should figure out how many days remain until each user’s birthday and which birthday is sooner.
Hint: It is much easier to solve this problem if you convert each date into an “absolute day” of year, from 1 through 365.
 */