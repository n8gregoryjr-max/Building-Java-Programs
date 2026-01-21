package Chapter02.Exercises;

public class Exercise16 {
    public static void main() {
        final int height = 6;
        final int length = 22;

        for (int rows = 1; rows <= height; rows++) {

            int slashes = 2 * (rows - 1);
            int bangs = length - 4 * (rows - 1);

            for (int i = 1; i <= slashes; i++) {
                System.out.print("\\");
            }
            for (int i = 1; i <= bangs; i++) {
                System.out.print("!");
            }
            for (int i = 1; i <= slashes; i++) {
                System.out.print("/");
            }
            System.out.println();
        }
    }
}
/*
Write a Java program called SlashFigure that produces the following output. Use nested for loops to capture the structure of the figure.

!!!!!!!!!!!!!!!!!!!!!!
\\!!!!!!!!!!!!!!!!!!//
\\\\!!!!!!!!!!!!!!////
\\\\\\!!!!!!!!!!//////
\\\\\\\\!!!!!!////////
\\\\\\\\\\!!//////////
 */