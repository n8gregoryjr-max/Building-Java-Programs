package Chapter02.Exercises;

public class Exercise02 {
    public static void main(String[] args) {
        squareRoot();
    }
    public static void squareRoot() {
        int i = 1;
        int j = 3;

        for (int k = 1; k <= 10; k++) {
            System.out.print(i + " ");
            i = i + j;
            j = j + 2;
        }
    }
}
/*
Write a for loop that produces the following output:

1 4 9 16 25 36 49 64 81 100

For added challenge, try to modify your code so that it does not need to use the * multiplication operator.
(It can be done! Hint: Look at the differences between adjacent numbers.)
 */