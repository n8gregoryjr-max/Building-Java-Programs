package Chapter02.Projects;

public class Project08 {
    public static final int OUTPUT = 10;     // Works with EVEN numbers from 8 onwards perfectly (Default is 10).
    public static final int INNER_WIDTH = OUTPUT * 3;

    public static void main(String[] args) {
        printBook();
    }

    public static void printBook() {
        printBookTop();
        printBookFront();
    }

    public static void printBookTop() {

            // Adds some space before the divider for the first line.
        for (int i = 0; i <= OUTPUT; i++) {
            System.out.print(" ");
        }
        printBookDivider();
        System.out.println();

            // Loop for the top of the book
        for (int i = 0; i < OUTPUT; i++) {
            int leftSpace = OUTPUT - i;
            int innerSpace = INNER_WIDTH - (3 * i) - 3;

            for (int j = 0; j < leftSpace; j++) {
                System.out.print(" ");
            }
            System.out.print("/");
            for (int j = 0; j < innerSpace; j++) {
                System.out.print(" ");
            }
            System.out.print("___/");
            for (int j = 0; j < i; j++) {
                System.out.print("__/");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("/");
            }
            System.out.println();
        }
    }

    public static void printBookFront() {
        int frontHeight = OUTPUT / 2;
        int frontSpace = (frontHeight - 4) * 3;

            // Adds the middle divider and pages.
        printBookDivider();
        for (int i = 0; i < OUTPUT; i++) {
            System.out.print("/");
        }
        System.out.println();

            // Loop for front of book.
        for (int i = 0; i < frontHeight; i++) {
            int onlyDiagnal = OUTPUT - (2 * i);

            System.out.print("|");
            for (int j = 0; j < frontSpace; j++) {
                System.out.print(" ");
            }
            System.out.print(" Building Java Programs ");
            for (int j = 0; j < frontSpace; j++) {
                System.out.print(" ");
            }
            System.out.print("|");
            for (int j = 0; j < onlyDiagnal; j++) {
                System.out.print("/");
            }
            System.out.println();
        }
            // Final divider
        printBookDivider();
    }

    public static void printBookDivider() {
        System.out.print("+");
        for (int i = 0; i < INNER_WIDTH; i++) {
            System.out.print("-");
        }
        System.out.print("+");
    }
}
/*
Write a program that produces the following figure (which vaguely resembles a textbook) as its output using nested for loops.
Use a class constant to make it possible to change the size of the figure (the following output uses a size of 10).

           +------------------------------+
          /                           ___/
         /                        ___/__//
        /                     ___/__/__///
       /                  ___/__/__/__////
      /               ___/__/__/__/__/////
     /            ___/__/__/__/__/__//////
    /         ___/__/__/__/__/__/__///////
   /      ___/__/__/__/__/__/__/__////////
  /   ___/__/__/__/__/__/__/__/__/////////
 /___/__/__/__/__/__/__/__/__/__//////////
+------------------------------+//////////
|    Building Java Programs    |//////////
|    Building Java Programs    |////////
|    Building Java Programs    |//////
|    Building Java Programs    |////
|    Building Java Programs    |//
+------------------------------+
 */