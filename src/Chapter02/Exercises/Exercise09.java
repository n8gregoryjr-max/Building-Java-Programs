package Chapter02.Exercises;

public class Exercise09 {
    // Total character width for each output line.
    public static final int LENGTH = 40;

    public static void main(String[] args) {
        allTogether();
    }

    // Puts all the other methods together nicely.
    public static void allTogether() {
        dashes();
        wiggles();
        numbers();
        dashes();
    }

    // Prints a full-width dash border.
    public static void dashes() {
        for (int i = 1; i <= LENGTH; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    // Prints the "_-^-" pattern to fill the full width.
    public static void wiggles() {
        final int quarterLength = LENGTH / 4;

        for (int i = 1; i <= quarterLength; i++) {
            System.out.print("_-^-");
        }
        System.out.println();
    }

    // Prints the remainder of i % 10 twice to form a 40-character sequence.
    public static void numbers() {
        final int halfLength = LENGTH / 2;

        for (int i = 1; i <= halfLength; i++) {
            int remainder = i % 10;

            for (int j = 1; j <= 2; j++) {
                System.out.print(remainder);
            }
        }
        System.out.println();
    }
}
/*
Write nested for loops to produce the following output, with each line 40 characters wide:

----------------------------------------
_-^-_-^-_-^-_-^-_-^-_-^-_-^-_-^-_-^-_-^-
1122334455667788990011223344556677889900
----------------------------------------
 */