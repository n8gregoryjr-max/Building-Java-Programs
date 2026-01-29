package Chapter03.Exercises;

public class Exercise11 {
    public static void main(String[] args) {
        distance(1, 0, 4, 4);
    }

    public static void distance(int x1, int y1, int x2, int y2) {
        double part1 = Math.pow(x2 - x1, 2);
        double part2 = Math.pow(y2 - y1, 2);
        double distance = Math.sqrt(part1 + part2);
        System.out.print(distance);
    }
}
/*
Write a method called distance that accepts four integer coordinates 𝑥1, 𝑦1, 𝑥2, and 𝑦2 as parameters and computes the distance
between points (𝑥1,𝑦1) and (𝑥2,𝑦2) on the Cartesian plane. The equation for the distance is:

    d = sqrt((x2-x1)^2 + (y2-y1)^2)

For example, the call of distance(1, 0, 4, 4) would return 5.0 and the call of distance(10, 2, 3, 15) would return 14.7648230602334.
 */