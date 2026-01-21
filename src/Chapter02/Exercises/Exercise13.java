package Chapter02.Exercises;

public class Exercise13 {
    public static void main(String[] args) {
        final int height = 5, width = 50;
        int sections = width / height;

        for (int i = 1; i <= height; i++) {
            for (int j = sections; j >= 1; j--) {
                int a = (j - 1) % sections;
                for (int k = 1; k <= height; k++) {
                    System.out.print(a);
                }
            }
            System.out.println();
        }
    }
}
/*
Modify the code so that it now produces the following output:

99999888887777766666555554444433333222221111100000
99999888887777766666555554444433333222221111100000
99999888887777766666555554444433333222221111100000
99999888887777766666555554444433333222221111100000
99999888887777766666555554444433333222221111100000
 */