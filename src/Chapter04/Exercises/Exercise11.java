package Chapter04.Exercises;

import java.util.*;

public class Exercise11 {
    void main() {
        Scanner console = new Scanner(System.in);
        longestName(console, 4);
    }

    public static void longestName(Scanner input, int n) {
            // Creates a placeholder for the longest name.
        String winner = "";

        for (int i = 1; i <= n; i++) {
                // Prompts user to enter a name.
            IO.print("name #" + i + "? ");
            String name = input.nextLine();

                // Makes placeholder into the longest name.
            if (name.length() > winner.length()) {
                    winner = name;
            } else if (name.isEmpty()) {

                    // Error checker, if nothing was entered.
                IO.print("Error! No name entered.");

                    // Ends for loop and set String winner to trigger ERROR message.
                i = n + 1;
                winner = "ERROR";
            }
        }

            // Error catcher.
        if (winner .equals("ERROR")) {
            IO.println("\nPlease try again!");

        } else {
                // Format name before sending last message.
            winner = winner.substring(0, 1).toUpperCase() + winner.substring(1).toLowerCase();

            IO.print(winner + "'s name is longest");
        }
    }
}
/*
Write a method called 'longestName' that accepts a Scanner for the console and an integer n as parameters
and prompts for n names, then prints the longest name (the name that contains the most characters)
in the format shown below, which might result from a call of longestName(console, 4):

    name #1? Roy
    name #2? DANE
    name #3? sTeFaNiE
    name #4? Mariana
    Stefanie's name is longest

 */