package Chapter04.Projects;

public class Project06 {
}
/*
A useful technique for catching typing errors is to use a check digit.
For example, suppose that a school assigns a six-digit number to each student.
A seventh digit can be determined from the other digits with the use of the following formula:

    7th digit = (1 * (1st digit) + 2 * (2nd digit) + ... + 6 * (6th digit)) % 10

When a user types in a student number, the user types all seven digits.
If the number is typed incorrectly, the check digit will fail to match in 90% of the cases.
Write an interactive program that prompts for a six-digit student number and reports
the check digit for that number, using the preceding formula.
 */