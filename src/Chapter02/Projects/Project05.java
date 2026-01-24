package Chapter02.Projects;

public class Project05 {
    public static final int STAIR_STEPS = 5;

    public static final int STAIR_WIDTH = (STAIR_STEPS * 5);
    public static final int TOTAL_WIDTH = STAIR_WIDTH + 7;
    public static int openSpace = STAIR_WIDTH - 5;
    public static int stairSpace = 0;

    public static void main(String[] args) {
        drawStairs();
    }

    public static void drawStairs(){
        for (int i = 0; i < STAIR_STEPS; i++) {
            section();
            openSpace -= 5;
        }
        floor();
    }

    public static void floor(){
        for (int i = 0; i < TOTAL_WIDTH; i++) {
            System.out.print("*");
        }
    }

    public static void section() {
        printOpenSpace(); printHead();

        printOpenSpace(); printTorso();

        printOpenSpace(); printLegs();
    }

    public static void printOpenSpace() {
        for (int i = 1; i <= openSpace; i++) {
            System.out.print(" ");
        }
    }

    public static void printStairSpace() {
        for (int i = 1; i <= stairSpace; i++) {
            System.out.print(" ");
        }
    }

    public static void printHead(){
        System.out.print("  o  ");
        printStep();
        printStairSpace();
        printEndStar();
        stairSpace += 5;
    }

    public static void printTorso(){
        System.out.print(" /|\\ ");
        printStar();
        printStairSpace();
        printEndStar();
    }

    public static void printLegs(){
        System.out.print(" / \\ ");
        printStar();
        printStairSpace();
        printEndStar();
    }

    public static void printStep(){
        System.out.print("******");
    }

    public static void printEndStar(){
        System.out.println("*");
    }

    public static void printStar(){
        System.out.print("*");
    }
}
/*
Write a program that produces the following output using nested for loops.
Use a class constant to make it possible to change the number of stairs in the figure.

                      o  *******
                     /|\ *     *
                     / \ *     *
                 o  ******     *
                /|\ *          *
                / \ *          *
            o  ******          *
           /|\ *               *
           / \ *               *
       o  ******               *
      /|\ *                    *
      / \ *                    *
  o  ******                    *
 /|\ *                         *
 / \ *                         *
********************************
 */