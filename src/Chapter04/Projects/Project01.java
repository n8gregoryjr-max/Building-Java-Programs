package Chapter04.Projects;

import java.util.Scanner;

public class Project01 {
    void main() {
        userPrompt(new Scanner(System.in));
    }

    public static void userPrompt(Scanner input) {
        // Prompt user for a number.
        IO.print("Enter a number from 1 to 3999: ");
        int num = input.nextInt();

        // Prechecks for out of bounds numbers.
        if (num < 1 || num > 3999) {
            throw new IllegalArgumentException();
        }

        // Plug number into formula.
        printRomanNumerals(num);
    }

    public static void printRomanNumerals(int a) {
        // Split number into single digits, one for each place.
        int first = a % 10, second = (a / 10) % 10, third = (a / 100) % 10, fourth = (a / 1000) % 10;

        // Initialize final string.
        String romanNum = "";

        // Go through each number, translate, add to end.
        romanNum += fourthCalc(fourth);
        romanNum += thirdCalc(third);
        romanNum += secondCalc(second);
        romanNum += firstCalc(first);

        IO.print(romanNum);
    }

    public static String firstCalc(int x) {
        // Initialize return string.
        String retNum = "";

        // Translate number into Roman Numeral
        if (x >= 1 && x <= 3) {
            for (int i = 0; i < x; i++) {
                retNum += "I";
            }
        } else if (x >= 4 && x <= 8) {
            if (x == 4) {
                retNum += "I";
            }
            retNum += "V";
            for (int i = 5; i < x; i++) {
                retNum += "I";
            }
        } else if (x == 9) {
            retNum = "IX";
        }

        // Return translated string.
        return retNum;
    }

    public static String secondCalc(int x) {
        // Initialize return string.
        String retNum = "";

        // Translate number into Roman Numeral
        if (x >= 1 && x <= 3) {
            for (int i = 0; i < x; i++) {
                retNum += "X";
            }
        } else if (x >= 4 && x <= 8) {
            if (x == 4) {
                retNum += "X";
            }
            retNum += "L";
            for (int i = 5; i < x; i++) {
                retNum += "X";
            }
        } else if (x == 9) {
            retNum = "XC";
        }

        // Return translated string.
        return retNum;
    }

    public static String thirdCalc(int x) {
        // Initialize return string.
        String retNum = "";

        // Translate number into Roman Numeral
        if (x >= 1 && x <= 3) {
            for (int i = 0; i < x; i++) {
                retNum += "C";
            }
        } else if (x >= 4 && x <= 8) {
            if (x == 4) {
                retNum += "C";
            }
            retNum += "D";
            for (int i = 5; i < x; i++) {
                retNum += "C";
            }
        } else if (x == 9) {
            retNum = "CM";
        }

        // Return translated string.
        return retNum;
    }

    public static String fourthCalc(int x) {
        // Initialize return string.
        String retNum = "";

        // Translate number into Roman Numeral
        for (int i = 0; i < x; i++) {
            retNum += "M";
        }

        // Return translated string.
        return retNum;
    }
}
/*
Write a program that prompts for a number and displays it in Roman numerals.
 */