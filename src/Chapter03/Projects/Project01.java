package Chapter03.Projects;

public class Project01 {
    void main() {
        christmasTrees(4, 7);
    }
    
    public static void christmasTrees(int segment, int height) {
        // formulas used for scaling in all loops.
        int space = height + segment - 2;
        int star = 1;

        // Prints each segment of the tree.
        for (int i = 0; i < segment; i++) {

            // Formulas to allow each segment to grow by one each time.
            int air = space - i;
            int leaves = star + (2 * i);

            // Prints each row until height is met.
            for (int j = 0; j < height; j++) {
                int starLeaves = leaves + (j * 2);
                int airSpace = air - j;

                for (int k = 0; k < airSpace; k++) {
                    IO.print(" ");
                }
                for (int k = 0; k < starLeaves; k++) {
                    IO.print("*");
                }
                IO.println();
            }
        }

        // Prints tree stand that is centered to the tree length.
        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < space; j++) {
                IO.print(" ");
            }
            IO.println("*");
        }
        for (int i = 0; i < space - 3; i++) {
            IO.print(" ");
        }
        IO.print("*******");
    }
}
/*
Write a program that produces images of Christmas trees as output. It should have a method with two parameters:
one for the number of segments in the tree and one for the height of each segment.

For example, the tree shown here on the left has three segments of height 4 and the one on the right has two segments of height 5:

         *            *
        ***          ***
       *****        *****
      *******      *******
        ***       *********
       *****         ***
      *******       *****
     *********     *******
       *****      *********
      *******    ***********
     *********        *
    ***********       *
         *         *******
         *
      *******

 */