package Chapter03.Exercises;

public class Exercise10 {
    public static void main(String[] args) {
        area(2);
    }

    public static void area(double r){
            // The formula for the area of a circle.
        System.out.print(r * r * Math.PI);
    }
}
/*
Write a method called area that accepts as a parameter the radius of a circle and that returns the area of the circle.
For example, the call area(2.0) should return 12.566370614359172.
Recall that area can be computed as pi (𝜋) times the radius squared and that Java has a constant called Math.PI.
 */