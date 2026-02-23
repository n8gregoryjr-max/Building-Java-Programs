package Chapter04.Exercises;

import java.util.Scanner;

public class Exercise22 {
    void main() {
        printAcronym("Breath of the Wild");
    }

    public static void printAcronym(String sentence) {
        Scanner acronym = new Scanner(sentence);
        String answer = "";

        while(acronym.hasNext()) {
            answer += acronym.next().charAt(0);
        }
        IO.print(answer);
    }
}
/*
Write a method called 'printAcronym' that accepts a string as its parameter
and prints the first letter of each word of the string as an acronym.
For example, the call of printAcronym("Breath of the Wild") should print "BotW".
You may assume that the string contains at least one word and
does not have any surrounding whitespace at its start or end.
 */