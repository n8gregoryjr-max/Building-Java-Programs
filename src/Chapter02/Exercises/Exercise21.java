package Chapter02.Exercises;

public class Exercise21 {
    public static final int HEIGHT = 6;
    public static final int LENGTH = (HEIGHT - 1) * 8;

    public static void main(String[] args) {
        for (int i = 0; i < HEIGHT; i++) {
            int slashLength = (LENGTH / 2) - (i * 4);
            int starLength = LENGTH - (2 * slashLength);

            for (int j = 1; j <= slashLength; j++) {
                    System.out.print("/");
            }
            for (int j = 1; j <= starLength; j++) {
                    System.out.print("*");
            }
            for (int j = 1; j <= slashLength; j++) {
                    System.out.print("\\");
            }
            System.out.println();
        }
    }
}
/*
Modify your StarFigure program from the previous exercise to become a new program named StarFigure2 that uses a global constant for the figure’s height.
(You may want to make loop tables first.) The previous output used a constant height of 5.
The following are the outputs for constant heights of 3 and 6:

Height 3
///////////\\\\\\\\\\\\
///////********\\\\\\\\
***********************

Height 6
///////////////\\\\\\\\\\\\\\\\\
///////////********\\\\\\\\\\\\\
////////****************\\\\\\\\\\
////************************\\\\\\
///*******************************\\\
********************************

 */