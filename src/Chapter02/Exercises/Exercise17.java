package Chapter02.Exercises;

public class Exercise17 {
    public static void main() {
        final int height = 8;
        final int length = height * 4 - 2;

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
Modify your SlashFigure program from the previous exercise to become a new program called SlashFigure2 that uses a
global constant for the figure’s height. (You may want to make loop tables first.)
The previous output used a constant height of 6. The following are the outputs for constant heights of 4 and 8:

Height 4
!!!!!!!!!!!!!!
\\!!!!!!!!!!//
\\\\!!!!!!////
\\\\\\!!//////

Height 8
!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
\\!!!!!!!!!!!!!!!!!!!!!!!!!!//
\\\\!!!!!!!!!!!!!!!!!!!!!!////
\\\\\\!!!!!!!!!!!!!!!!!!//////
\\\\\\\\!!!!!!!!!!!!!!////////
\\\\\\\\\\!!!!!!!!!!//////////
\\\\\\\\\\\\!!!!!!////////////
\\\\\\\\\\\\\\!!//////////////

 */