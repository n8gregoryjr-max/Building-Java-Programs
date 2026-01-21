package Chapter02.Exercises;

public class Exercise19 {
    public static final int TOTAL_HEIGHT = 9;
    public static final int NUMBER_OF_DIVIDER_LINES = 3;
    public static final int SECTIONS = 2;

    public static final int PILLAR_HEIGHT = (TOTAL_HEIGHT - NUMBER_OF_DIVIDER_LINES) / SECTIONS;

    public static void main(String[] args) {
        drawDividerLine();
        drawPillars();
        drawDividerLine();
        drawPillars();
        drawDividerLine();
    }

    public static void drawDividerLine() {
        System.out.print("+");
        for (int i = 1; i <= SECTIONS; i++) {
            System.out.print("===");
            System.out.print("+");
        }
    }

    public static void drawPillars() {
        System.out.println();
        for (int i = 1; i <= PILLAR_HEIGHT; i++) {
            System.out.print("|");
            for (int j = 1; j <= SECTIONS; j++) {
                System.out.print("   ");
                System.out.print("|");
            }
            System.out.println();
        }
    }
}
/*
Use your pseudocode from the previous exercise to write a Java program called Window that produces the preceding figure as output.
Use nested for loops to print the repeated parts of the figure. Once you get it to work,
add a class constant so that the size of the figure can be changed simply by changing the constant’s value.
 */