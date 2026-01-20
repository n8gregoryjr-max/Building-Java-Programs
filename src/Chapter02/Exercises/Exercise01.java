package Chapter02.Exercises;

public class Exercise01 {
    public static void main(String[] args) {
        formula();
    }
    public static void formula() {
        // Initial position
        double s0 = 5;
        // Initial velocity
        double v0 = 3.425;
        // Rate of acceleration
        double a = 1.5;
        // Given time
        double t = 50;
        // Declare the position as a double
        double s;

        // Uses formula provided and declares it as s
        s = s0 + v0 * t + .5 * a * (t * t);

        // Returns s
        System.out.println(s);
    }
}
/*
In physics, a common useful equation for finding the position 𝑠 of a body in linear motion at a given time 𝑡,
based on its initial position 𝑠0, initial velocity 𝑣0, and rate of acceleration 𝑎, is the following:

𝑠 = 𝑠0 + 𝑣0 * 𝑡 + 1/2 * 𝑎 * 𝑡^2

Write code to declare variables for 𝑠0,𝑣0,𝑎, and 𝑡, and then write the code to compute 𝑠 on the basis of these values.
 */