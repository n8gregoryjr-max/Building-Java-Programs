package Chapter03.Exercises;

public class Exercise23 {
    public static void main(String[] args) {
        printIndexed("ZELDA");
    }

    public static void printIndexed(String zelda){
        int stringLength = zelda.length();
        for (int i = 0; i < stringLength; i++) {
            char letter = zelda.charAt(i);
            System.out.print(letter);
            System.out.print(stringLength - 1 - i);
        }
    }
}
/*
Write a method called printIndexed that accepts a string as its parameter and prints the string’s characters in order followed by their indexes in reverse order.
For example, the call of printIndexed("ZELDA") should print Z4E3L2D1A0 to the console.
 */