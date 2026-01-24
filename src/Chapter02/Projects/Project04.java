package Chapter02.Projects;

public class Project04 {
    public static final int SECTION_HEIGHT = 4;
    public static final int FRAME_LENGTH = (SECTION_HEIGHT * 2) + 2;

    public static void main(String[] args) {
        drawHourGlass();
    }

    public static void drawHourGlass() {
        drawFrame();
        hourGlassTop();
        hourGlassBottom();
        drawFrame();
    }

    public static void drawFrame() {
        System.out.print("|");
        for (int i = 1; i <= FRAME_LENGTH; i++) {
            System.out.print("\"");
        }
        System.out.println("|");
    }

    public static void hourGlassTop() {
        for (int i = 1; i <= SECTION_HEIGHT; i++) {
            int sand = FRAME_LENGTH - (2 * i);

            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            System.out.print("\\");
            for (int j = 1; j <= sand; j++) {
                System.out.print(":");
            }
            System.out.println("/");
        }
        int divider = SECTION_HEIGHT + 1;

        for (int i = 1; i <= divider; i++) {
            System.out.print(" ");
        }
        System.out.println("||");
    }

    public static void hourGlassBottom() {
        for (int i = 1; i <= SECTION_HEIGHT; i++) {
            int space = SECTION_HEIGHT - i + 1;
            int sand = 2 * i;

            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            System.out.print("/");
            for (int j = 1; j <= sand; j++) {
                System.out.print(":");
            }
            System.out.println("\\");
        }
    }
}
/*
Write a program that produces the following hourglass figure as its output using nested for loops:

|""""""""""|
 \::::::::/
  \::::::/
   \::::/
    \::/
     ||
    /::\
   /::::\
  /::::::\
 /::::::::\
|""""""""""|
 */