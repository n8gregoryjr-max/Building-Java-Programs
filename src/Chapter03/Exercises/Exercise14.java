package Chapter03.Exercises;

public class Exercise14 {
    public static void main(String[] args) {
        cylinderSurfaceArea(3, 4.5);
    }

    public static void cylinderSurfaceArea(double r, double h) {
        double surfaceArea = (2 * Math.PI * r * r) + (2 * Math.PI * r * h);
        System.out.print(surfaceArea);
    }
}
/*
Write a method called cylinderSurfaceArea that accepts a radius and height as parameters and returns the surface area of a cylinder with those dimensions.
For example, the call cylinderSurfaceArea(3.0, 4.5) should return 141.3716694115407.
The formula for the surface area of a cylinder with radius 𝑟 and height ℎ is the following:

    surface area = 2𝜋𝑟^2 + 2𝜋𝑟ℎ

 */