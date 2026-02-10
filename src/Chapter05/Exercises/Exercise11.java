package Chapter05.Exercises;

import java.util.Random;

public class Exercise11 {
    void main() {
        threeHeads(54321);
    }
    public static void threeHeads(int seed) {
            // Generate Pseudorandom number generator w/ set seed.
        Random r = new Random(seed);

            // for loop that counts up to 3, signifying 3 heads.
        for (int i = 0; i < 3;) {

                // Set placeholder number
            int a = r.nextInt(2);

                // Incrementally increase 'i' per head rolled.
            if (a == 1) {
                IO.print("H ");
                i++;

                // Reset counter every tails rolled.
            } else {
                IO.print("T ");
                i = 0;
            }
        }
            // VICTORY!!!
        IO.print("\nThree heads in a row!");
    }
}
/*
Write a method called 'threeHeads' that repeatedly flips a coin until the results of the coin toss are three heads in a row.
You should use a Random object to make it equally likely that a head or a tail will appear.
Each time the coin is flipped, display H for heads or T for tails.
When three heads in a row are flipped, the method should print a congratulatory message.
Here is a possible output of a call to the method:

    T T H T T T H T H T H H H
    Three heads in a row!
 */