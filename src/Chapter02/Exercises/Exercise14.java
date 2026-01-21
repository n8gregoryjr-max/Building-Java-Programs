package Chapter02.Exercises;

public class Exercise14 {
    public static void main(String[] args) {
        final int height = 4, biggestNum = 9;

        for (int i = 1; i <= height; i++) {
            for (int j = biggestNum; j >= 1; j--) {
                for (int k = 1; k <= j; k++) {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}
/*
Modify the code so that it now produces the following output:

999999999888888887777777666666555554444333221
999999999888888887777777666666555554444333221
999999999888888887777777666666555554444333221
999999999888888887777777666666555554444333221
 */