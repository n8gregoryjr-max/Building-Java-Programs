package Chapter03.Exercises;

public class Exercise04 {
    public static void main(String[] args) {
        printSquare(3, 9);
    }

    public static void printSquare(int min, int max){
        int range = max - min + 1;


        for (int i = 0; i < range; i++) {
            int output = range - i;
            for (int j = 0; j < output; j++) {
                System.out.print(min + j + i);
            }
            for (int j = 0; j < i; j++) {
                System.out.print(min + j);
            }
            System.out.println();
        }
    }
}
/*
Write a method called printSquare that accepts a minimum and maximum integer and prints a square of lines of increasing numbers.
The first line should start with the minimum, and each line that follows should start with the next-higher number.
The sequence of numbers on a line wraps back to the minimum after it hits the maximum.
For example, the call:

    printSquare(3, 7);

should produce the following output:

    34567
    45673
    56734
    67345
    73456

If the maximum passed is less than the minimum, the method produces no output.
 */