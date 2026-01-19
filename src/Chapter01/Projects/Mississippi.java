package Chapter01.Projects;

public class Mississippi {
    public static void main(String[] args) {
        beginning();
        middle();
        end();
    }
    public static void letterM() {
        System.out.println("""
                M     M
                MM   MM
                M M M M
                M  M  M
                M     M
                M     M
                M     M
                """);
    }
    public static void letterI() {
        System.out.println("""
                IIIIIII
                   I
                   I
                   I
                   I
                   I
                IIIIIII
                """);
    }
    public static void letterS() {
        System.out.println("""
                 SSSSS
                S     S
                S
                 SSSSS
                      S
                S     S
                 SSSSS
                """);
    }
    public static void letterP() {
        System.out.println("""
                PPPPPP
                P     P
                P     P
                PPPPPP
                P
                P
                P
                """);
    }
    public static void beginning() {
        letterM();
    }
    public static void middle() {
        letterI();
        letterS();
        letterS();
        letterI();
        letterS();
        letterS();
    }
    public static void end() {
        letterI();
        letterP();
        letterP();
        letterI();
    }
}
//Self note: I think they mean to do it going down, and not sideways. That makes more sense to me.
/*
Write a program to spell out MISSISSIPPI using block letters like the following (one per line):

M     M    IIIII     SSSSS     PPPPPP
MM   MM      I      S     S    P     P
M M M M      I      S          P     P
M  M  M      I       SSSSS     PPPPPP
M     M      I            S    P
M     M      I      S     S    P
M     M    IIIII     SSSSS     P
 */