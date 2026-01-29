package Chapter03.Exercises;
    // Import the utility package for Scanner class.
import java.util.*;

public class Exercise20 {
    public static void main(String[] args) {
        inputBirthday();
    }

    public static void inputBirthday(){
            // Initialize scanner, name it 'input'.
        Scanner input = new Scanner(System.in);
            // Ask question and store answer as a String.
        System.out.println("On what day of the month were you born?");
        String day = input.nextLine();
            // Ask another question and store answer as a String.
        System.out.println("What is the name of the month in which you were born?");
        String month = input.nextLine();
            // Ask last question and store answer as a String.
        System.out.println("During what year were you born?");
        String year = input.nextLine();
            // Use stored strings to give a response based on answers.
        System.out.println("You were born on " + month + " " + day + ", " + year +". You’re mighty old!");
    }
}
/*
Write a method called inputBirthday that accepts a Scanner for the console as a parameter and prompts the user
to enter a month, day, and year of birth, then prints the birthdate in a suitable format.
Here is an example dialogue with the user:

    On what day of the month were you born? 8
    What is the name of the month in which you were born? May
    During what year were you born? 1981
    You were born on May 8, 1981. You’re mighty old!
 */