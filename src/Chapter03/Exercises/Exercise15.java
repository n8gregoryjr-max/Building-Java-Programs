package Chapter03.Exercises;

public class Exercise15 {
    public static void main(String[] args) {
        sphereVolume(2.0);
    }

    public static void sphereVolume(double r) {
            // I could do it all in one line, but it feels more readable by doing it like this.
        double r3 = Math.pow(r, 3);
        double v = ((double) 4 / 3) * Math.PI * r3;
        System.out.print(v);
    }
}
/*
Write a method called sphereVolume that accepts a radius as a parameter and returns the volume of a sphere with that radius.
For example, the call sphereVolume(2.0) should return 33.510321638291124.
The formula for the volume of a sphere with radius 𝑟 is the following:

    Volume = 4/3 * pi * 𝑟^3
 */