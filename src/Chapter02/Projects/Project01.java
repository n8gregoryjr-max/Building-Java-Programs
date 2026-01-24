package Chapter02.Projects;

public class Project01 {
    // Changing HEIGHT will affect its... height? Yeah. It also affects the formulas which allow it to scale. <3
    public static final int HEIGHT = 17;

    public static void main(String[] args) {
        drawShape();
    }

    public static void drawShape() {
        for (int i = 1; i <= HEIGHT; i++) {
            int starFormula = HEIGHT - i;
            int slash = (2 * HEIGHT) - (2 * i);
            int backSlash = (2 * i) - 2;

            for (int j = 1; j <= starFormula; j++) {
                System.out.print("*");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= slash; j++) {
                System.out.print("/");
            }

            for (int j = 1; j <= backSlash; j++) {
                System.out.print("\\");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= starFormula; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/*
Write a program that produces the following output using nested for loops:

****** //////////// ******
*****  //////////\\  *****
****   ////////\\\\   ****
***    //////\\\\\\    ***
**     ////\\\\\\\\     **
*      //\\\\\\\\\\      *
       \\\\\\\\\\\\
 */