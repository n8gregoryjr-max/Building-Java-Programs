package Chapter03.Exercises;

import java.util.Scanner;

public class Exercise22 {
    public static void main(String[] args) {
        nameGame();
    }

    public static void nameGame() {
            // Basic game introduction that asks for First and Last name.
        Scanner input = new Scanner(System.in);
        System.out.println("We're going to play the NAME GAME!\n" +
                "To play the name game, i'm going to need your name.\n"
                + "\n"
                + "So... What's your First name?");
        String fullFirstName = input.nextLine();
        System.out.println("Awesome! Now, what's your Last name?");
        String fullLastName = input.nextLine();
        System.out.println("""
                Perfect! Now, lets make you a song!
                """);
            // Converts first name into versions to use for the song right.
        String partFirstName = nameConversion(fullFirstName);
        String partLastName = nameConversion(fullLastName);
            // Prints song
        printNameGame(fullFirstName,partFirstName);
        printNameGame(fullLastName, partLastName);

        System.out.println("\nThank you for playing!");
    }

    public static String nameConversion(String a) {
        String name = "";
        for (int i = 1; i < a.length(); i++) {
            name += a.charAt(i);
        }
        return name;
    }

    public static void printNameGame(String full, String part) {
        System.out.println(full + ", " + full + ", bo-b" + part);
        System.out.println("Banana-fana fo-f" + part);
        System.out.println("Fee-fi-mo-m" + part);
        System.out.println(full + "!");
    }
}
/*
Write a program that outputs “The Name Game,” where the user inputs a first and last name and a song is printed about their first, then last, name.
Use a method to avoid redundancy.
 */