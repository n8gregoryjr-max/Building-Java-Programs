package Chapter02.Projects;

public class Project03 {
    public static final int SECTION_HEIGHT = 4;
    public static final int WIDTH = (2 * SECTION_HEIGHT) + 1;

    public static void main(String[] args) {
        drawTop();
        drawBottom();
    }

    public static void drawTop() {
        divider();
        christmasTree();
        upsideDownChristmasTree();
        divider();
    }

    public static void drawBottom() {
        upsideDownChristmasTree();
        christmasTree();
        divider();
    }

    public static void divider() {
        System.out.print("+");
        for (int i = 1; i <= WIDTH; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }

    public static void christmasTree() {
        for (int i = 1; i <= SECTION_HEIGHT; i++) {
            int space = SECTION_HEIGHT + 1 - i;
            int slash = i - 1;

            System.out.print("|");
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= slash; j++) {
                System.out.print("/");
            }
            System.out.print("*");
            for (int j = 1; j <= slash; j++) {
                System.out.print("\\");
            }
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }

    public static void upsideDownChristmasTree() {
        for (int i = 1; i <= SECTION_HEIGHT; i++) {
            int slash = SECTION_HEIGHT - i;

            System.out.print("|");
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= slash; j++) {
                System.out.print("\\");
            }
            System.out.print("*");
            for (int j = 1; j <= slash; j++) {
                System.out.print("/");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }
}

//Write a program that produces the following output using nested for loops:
//
//  +---------+
//  |    *    |
//  |   /*\   |
//  |  //*\\  |
//  | ///*\\\ |
//  | \\\*/// |
//  |  \\*//  |
//  |   \*/   |
//  |    *    |
//  +---------+
//  | \\\*/// |
//  |  \\*//  |
//  |   \*/   |
//  |    *    |
//  |    *    |
//  |   /*\   |
//  |  //*\\  |
//  | ///*\\\ |
//  +---------+

