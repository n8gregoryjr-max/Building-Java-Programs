package Chapter04.Exercises;

public class Exercise19 {
    void main() {
        IO.print("Q" + quadrant(1, -1));
    }

    public static int quadrant(double x, double y) {
            // Placeholder for if x or y is zero.
        int a = 0;

        if (y > 0) {
            if (x > 0) {
                a = 1;
            } else if (x < 0) {
                a = 2;
            }
        } else if (y < 0) {
            if (x < 0) {
                a = 3;
            } else if (x > 0) {
                a = 4;
            }
        }
        return a;
    }
}
/*
Write a method called 'quadrant' that accepts as parameters a pair of double values representing an (x, y)
point and returns the quadrant number for that point.
Recall that quadrants are numbered as integers from 1 to 4 with the upper-right quadrant numbered 1 and the subsequent
quadrants numbered in a counterclockwise fashion:

    (+,-) | (+,+)
   -------|-------
    (-,-) | (-,+)

Notice that the quadrant is determined by whether the x and y coordinates are positive or negative numbers.
Return 0 if the point lies on the x- or y-axis.
For example, the call of quadrant(-2.3, 3.5) should return 2 and the call of quadrant(4.5, -4.5) should return 4.
 */