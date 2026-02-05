package Chapter03.Projects;

public class Project05 {
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