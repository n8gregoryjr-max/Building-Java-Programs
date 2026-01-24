package Chapter02.Projects;

public class Project06 {
    public static final int PATTERN_HEIGHT = 3;     // The height of each triangle in the middle section (3 by default).
    public static final int PATTERN_AMOUNT = 2;     // The amount of triangle there are in each section (2 by default).

    public static final int HALF_INNER_WIDTH = PATTERN_HEIGHT * PATTERN_AMOUNT;

    public static void main(String[] args) {
        printRocket();
    }

    public static void printRocket() {
        printCone();
        printDiamondSegment();
        printCrossSegment();
        printCone();
    }

    public static void printDiamondSegment() {
        printDivider();
        printA();
        printV();
    }

    public static void printCrossSegment() {
        printDivider();
        printV();
        printA();
        printDivider();
    }

    public static void printCone() {
        for (int i = 1; i < HALF_INNER_WIDTH; i++) {
            int openSpace = HALF_INNER_WIDTH - i;

            for (int j = 0; j < openSpace; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("/");
            }
            System.out.print("**");
            for (int j = 0; j < i; j++) {
                System.out.print("\\");
            }
            System.out.println();
        }
    }

    public static void printDivider() {
        System.out.print("+");
        for (int i = 0; i < HALF_INNER_WIDTH; i++) {
            System.out.print("=*");
        }
        System.out.println("+");
    }

    public static void printA() {
        for (int i = 1; i <= PATTERN_HEIGHT; i++) {
            int sideSpace = PATTERN_HEIGHT - i;

            System.out.print("|");
            for (int k = 0; k < PATTERN_AMOUNT; k++) {

                for (int j = 0; j < sideSpace; j++) {
                    System.out.print(".");
                }
                for (int j = 0; j < i; j++) {
                    System.out.print("/\\");
                }
                for (int j = 0; j < sideSpace; j++) {
                    System.out.print(".");
                }
            }
            System.out.println("|");
        }
    }

    public static void printV() {
        for (int i = 0; i < PATTERN_HEIGHT; i++) {
            int patternReps = PATTERN_HEIGHT - i;

            System.out.print("|");
            for (int k = 0; k < PATTERN_AMOUNT; k++) {

                for (int j = 0; j < i; j++) {
                    System.out.print(".");
                }
                for (int j = 0; j < patternReps; j++) {
                    System.out.print("\\/");
                }
                for (int j = 0; j < i; j++) {
                    System.out.print(".");
                }
            }
            System.out.println("|");
        }
    }
}
/*
Write a program that produces the following rocket ship figure as its output using nested for loops.
Use a class constant to make it possible to change the size of the rocket (the following output uses a size of 3).

     /**\
    //**\\
   ///**\\\
  ////**\\\\
 /////**\\\\\
+=*=*=*=*=*=*+
|../\..../\..|
|./\/\../\/\.|
|/\/\/\/\/\/\|
|\/\/\/\/\/\/|
|.\/\/..\/\/.|
|..\/....\/..|
+=*=*=*=*=*=*+
|\/\/\/\/\/\/|
|.\/\/..\/\/.|
|..\/....\/..|
|../\..../\..|
|./\/\../\/\.|
|/\/\/\/\/\/\|
+=*=*=*=*=*=*+
     /**\
    //**\\
   ///**\\\
  ////**\\\\
 /////**\\\\\
 */