package Chapter02.Exercises;

public class Exercise20 {
    public static final int HEIGHT = 5;
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
Write a Java program called StarFigure that produces the following output.
Use nested for loops to capture the structure of the figure.

////////////////\\\\\\\\\\\\\\\\
////////////********\\\\\\\\\\\\
////////****************\\\\\\\\
////************************\\\\
********************************
 */