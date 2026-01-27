package Chapter03.Exercises;

import java.util.*;

public class Exercise21 {
    public static void main(String[] args) {
        processName(new Scanner(System.in));
    }

    public static void processName(Scanner input) {
        System.out.print("Please enter your full name: ");
        String firstName = input.next();
        String lastName = input.next();
        System.out.print("Your name in reverse order is " + lastName + ", " + firstName);
    }
}
/*
Write a method called processName that accepts a Scanner for the console as a parameter and prompts the user to enter a full name,
then prints the name in reverse order (i.e., last name, first name). Here is an example dialogue with the user:

    Please enter your full name: Sammy Jankis
    Your name in reverse order is Jankis, Sammy
 */