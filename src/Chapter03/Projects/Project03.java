package Chapter03.Projects;

public class Project03 {
    public static int total = 0;
    void main() {
        printSong();
    }

    public static void printSong() {
        IO.println("Day\tPresents Received\tTotal Presents");
        for (int i = 1; i <= 12; i++) {
            IO.print(i + "\t" + i + "\t\t\t\t\t");
            printPresents(i);
        }
    }

    public static void printPresents(int a) {
        total += a;
        IO.println(total);
    }
}
/*
Write a program that shows the total number of presents that the person in the song “The Twelve Days of Christmas” received on each day
as indicated in Table 3.5.

    Day	Presents Received	Total Presents
    1	1	                1
    2	2	                3
    3	3	                6
    4	4	                10
    5	5	                15
    . . .	. . .	. . .

 */