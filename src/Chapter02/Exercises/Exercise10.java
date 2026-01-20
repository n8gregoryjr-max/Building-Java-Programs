package Chapter02.Exercises;

public class Exercise10 {
    // Total character width for each output line.
    public static final int WIDTH = 60;

    public static void main(String[] args) {
        cleanOutput();
    }

    // Makes output a little more clean.
    public static void cleanOutput() {
        top();
        bottom();
    }

    // 6 loops of a 10-character wide string w/ a '|' at the end
    public static void top() {
        final int sections = WIDTH / 10;
        final int sectionLength = WIDTH / sections;

        for (int i = 1; i <= sections; i++) {
            for (int j = 1; j < sectionLength; j++) {
                System.out.print(" ");
            }
            System.out.print("|");
        }
        System.out.println();
    }

    //
    public static void bottom() {
        for (int i = 1; i <= WIDTH; i++) {
            final int remainder = i % 10;

            System.out.print(remainder);
        }
        System.out.println();
    }
}
/*
It’s common to print a rotating, increasing list of single-digit numbers at the start of a program’s output as a visual guide to
number the columns of the output to follow. With this in mind, write nested for loops to produce the following output,
with each line 60 characters wide:

         |         |         |         |         |         |
123456789012345678901234567890123456789012345678901234567890
 */