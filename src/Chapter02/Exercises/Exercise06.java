package Chapter02.Exercises;

public class Exercise06 {
    public static void main(String[] args) {
        drawNumPyramid();
    }
    public static void drawNumPyramid() {
        int height = 7;
        // The height works up to 9. Any further and it looks silly, lol.

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
/*
Write nested for loops to produce the following output:

1
22
333
4444
55555
666666
7777777
 */