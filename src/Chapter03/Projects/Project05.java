package Chapter03.Projects;

import java.util.Scanner;

public class Project05 {
    void main() {
        promptUser(new Scanner(System.in));
    }

    public static void promptUser(Scanner input) {
        // First location info.
        IO.println("What is the latitude and longitude of the first location?");
        String lat1Dir = input.next();
        double lat1 = Math.toRadians(input.nextDouble());
        String lon1Dir = input.next();
        double lon1 = Math.toRadians(input.nextDouble());

        // Second location info.
        IO.println("Okay. What is the latitude and longitude of the second location?");
        String lat2Dir = input.next();
        double lat2 = Math.toRadians(input.nextDouble());
        String lon2Dir = input.next();
        double lon2 = Math.toRadians(input.nextDouble());

        lat1 = latCalc(lat1, lat1Dir);
        lat2 = latCalc(lat2, lat2Dir);
        lon1 = lonCalc(lon1, lon1Dir);
        lon2 = lonCalc(lon2, lon2Dir);

        double lonDiff = lonDiffCalc(lon1, lon2);
        double partA = Math.sin(lat1) * Math.sin(lat2);
        double partB = Math.cos(lat1) * Math.cos(lat2) * Math.cos(lonDiff);
        double angDiff = Math.acos(partA + partB);
        double r = 6372.795;

        IO.println(r * angDiff + " km");

    }

    public static double latCalc(double lat, String dir) {
        dir = dir.toLowerCase();
        if (dir.equals("north")) {
            return lat;
        } else if (dir.equals("south")) {
            return -1 * lat;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static double lonCalc(double lon, String dir) {
        dir = dir.toLowerCase();
        if (dir.equals("east")) {
            return lon;
        } else if (dir.equals("west")) {
            return -1 * lon;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static double lonDiffCalc(double a, double b) {
        if ((a < 0 && b < 0) || (a > 0 && b > 0)) {
            return Math.abs((a - b));
        } else {
            return 360 - (Math.abs(a) + Math.abs(b));
        }
    }
}
/*
Write a program that computes the spherical distance between two points on the surface of the Earth, given their latitudes and longitudes.
This is a useful operation because it tells you how far apart two cities are if you multiply the distance by the radius of the Earth, which is roughly 6372.795km.
Let lat1, lon1 and lat2, lon2 be the latitude and longitude of two points, respectively.
lonDiff, the longitudinal difference, and angDiff, the angular difference/distance in radians, can be determined as follows from the spherical law of cosines:

    angDiff = arccos(sin(lat1) * sin(lat2) + cos(lat1) * cos(lat2) * cos(lonDiff))

For example, consider the latitude and longitude of two major cities:
    - Nashville, TN: North 36 degrees 7.2 minutes, West 86 degrees 40.2 minutes
    - Los Angeles, CA: North 33 degrees 56.4 minutes, West 118 degrees 24 minutes

You must convert these coordinates to radians before you can use them effectively in the formula. After conversion, the coordinates become
    - Nashville: lat1 = 36.12 degrees = 0.6304 radians, lon1 = -87.67 degrees = -1.5127 radians
    - Los Angeles: lat2 = 33.94 degrees = 0.5924 radians, lon2 = -118.40 degrees = -2.0665 radians

Using these values in the angular distance equation, you get

    r * angDiff = 6372.795 * 0.45206 = 2887.259 km

Thus, the distance between these cities is about 2887 km, or 1794 miles.
(Note: To solve this problem, you will need to use the Math.acos method, which returns an arccosine angle in radians.)
 */