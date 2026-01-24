package Chapter02.Projects;

public class Project02 {
    // I see this shape as a mirror that reflects a "/" in two ways. Twice over the X axis and once over the Y axis.
    public static final int AMOUNT = 2;     // AMOUNT represents how many there are over the X axis (2 by default).
    public static final int LENGTH = 3;     // LENGTH is how long the dash is (3 by default).

    public static final int WIDTH = 2 * LENGTH;

    public static void main(String[] args) {
        fullMirror();
    }

    public static void fullMirror() {
        divider();
        topMirror();
        bottomMirror();
    }

    public static void divider() {
        System.out.print("+");
        for (int i = 1; i <= WIDTH; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }

    public static void topMirror() {
        for (int i = 1; i <= AMOUNT; i++) {
            for (int j = 1; j <= LENGTH; j++) {
                int outerSpace = LENGTH - j;
                int innerSpace = (2 * j) - 2;

                System.out.print("|");
                for (int k = 1; k <= outerSpace; k++) {
                    System.out.print(" ");
                }
                System.out.print("^");
                for (int k = 1; k <= innerSpace; k++) {
                    System.out.print(" ");
                }
                System.out.print("^");
                for (int k = 1; k <= outerSpace; k++) {
                    System.out.print(" ");
                }
                System.out.println("|");
            }
        }
        divider();
    }

    public static void bottomMirror() {
        for (int i = 1; i <= AMOUNT; i++) {
            for (int j = 1; j <= LENGTH; j++) {
                int outerSpace = j - 1;
                int innerSpace = (2 * LENGTH) - (2 * j);

                System.out.print("|");
                for (int k = 1; k <= outerSpace; k++) {
                    System.out.print(" ");
                }
                System.out.print("V");
                for (int k = 1; k <= innerSpace; k++) {
                    System.out.print(" ");
                }
                System.out.print("V");
                for (int k = 1; k <= outerSpace; k++) {
                    System.out.print(" ");
                }
                System.out.println("|");
            }
        }
        divider();
    }
}
/*
Write a program that produces the following output using nested for loops:

+------+
|  ^^  |
| ^  ^ |
|^    ^|
|  ^^  |
| ^  ^ |
|^    ^|
+------+
|v    v|
| v  v |
|  vv  |
|v    v|
| v  v |
|  vv  |
+------+
 */