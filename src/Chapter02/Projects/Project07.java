package Chapter02.Projects;

public class Project07 {
    public static final int HEIGHT = 4;     // Section height for each piece (Default is 4).
    public static final int SECTION_WIDTH = HEIGHT * 3;

    public static void main(String[] args) {
        allTogether();
    }

    public static void allTogether() {
        printLine();
        printCone();
        printDivider();
        printCup();
        printLine();
        printPillar();
        printCone();
        printDivider();
    }

    public static void printLine() {
        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < SECTION_WIDTH; j++) {
                System.out.print(" ");
            }
            System.out.println("||");
        }
    }

    public static void printDivider() {
        int innerWidth = SECTION_WIDTH * 2;

        System.out.print("|");
        for (int i = 0; i < innerWidth; i++) {
            System.out.print("\"");
        }
        System.out.println("|");
    }

    public static void printCone() {
        for (int i = 1; i <= HEIGHT; i++) {
            int space = SECTION_WIDTH - (3 * i);
            int filler = 3 * i - 3;

            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            System.out.print("__/");
            for (int j = 0; j < filler; j++) {
                System.out.print(":");
            }
            System.out.print("||");
            for (int j = 0; j < filler; j++) {
                System.out.print(":");
            }
            System.out.println("\\__");
        }
    }

    public static void printCup() {
        for (int i = 0; i < HEIGHT; i++) {
            int space = 2 * i;
            int filler = SECTION_WIDTH - 1 - (2 * i);

            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            System.out.print("\\_");
            for (int j = 0; j < filler; j++) {
                System.out.print("/\\");
            }
            System.out.println("_/");
        }
    }

    public static void printPillar() {
        int space = SECTION_WIDTH - 3;
        int length = 4 * HEIGHT;

        for (int j = 0; j < length; j++) {
            for (int i = 0; i < space; i++) {
                System.out.print(" ");
            }
            for (int i = 0; i < 2; i++) {
                System.out.print("|%%|");
            }
            System.out.println();
        }
    }
}
/*
Write a program that produces the following figure (which vaguely resembles the Seattle Space Needle) as its output using nested for loops.
Use a class constant to make it possible to change the size of the figure (the following output uses a size of 4).

            ||
            ||
            ||
            ||
         __/||\__
      __/:::||:::\__
   __/::::::||::::::\__
__/:::::::::||:::::::::\__
|""""""""""""""""""""""""|
\_/\/\/\/\/\/\/\/\/\/\/\_/
  \_/\/\/\/\/\/\/\/\/\_/
    \_/\/\/\/\/\/\/\_/
      \_/\/\/\/\/\_/
            ||
            ||
            ||
            ||
         |%%||%%|
         |%%||%%|
         |%%||%%|
         |%%||%%|
         |%%||%%|
         |%%||%%|
         |%%||%%|
         |%%||%%|
         |%%||%%|
         |%%||%%|
         |%%||%%|
         |%%||%%|
         |%%||%%|
         |%%||%%|
         |%%||%%|
         |%%||%%|
         __/||\__
      __/:::||:::\__
   __/::::::||::::::\__
__/:::::::::||:::::::::\__
|""""""""""""""""""""""""|
 */