package Chapter02.Exercises;

public class Exercise23 {
    public static final int HEIGHT = 10;

    public static void main(String[] args) {
        for (int x = 1; x <= HEIGHT; x++) {
            int sideStar = ((x - 1) * 2);
            int dollarSign = HEIGHT - x + 1;
            int middleStar = ((HEIGHT - x) * 2) + 1;

            for (int i = 1; i <= sideStar; i++) {
                System.out.print("*");
            }

            for (int i = 1; i <= dollarSign; i++) {
                System.out.print("$");
            }

            for (int i = 0; i <= middleStar; i++) {
                System.out.print("*");
            }

            for (int i = 1; i <= dollarSign; i++) {
                System.out.print("$");
            }

            for (int i = 1; i <= sideStar; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/*
Modify your DollarFigure program from the previous exercise to become a new program called DollarFigure2 that uses a global constant for the figure’s height.
(You may want to make loop tables first.) The previous output used a constant height of 7.
 */