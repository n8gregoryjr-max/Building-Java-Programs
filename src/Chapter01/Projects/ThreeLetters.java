package Chapter01.Projects;

public class ThreeLetters {
    public static void main(String[] args) {
        toCloseFamily();
        toDistantRelatives();
        toFriendsAndAcquaintances();
    }

//Three separate methods. One for each type of person I would send a message to.

    public static void toCloseFamily() {
        letterHead();
        System.out.println("<Name of Sibling/Parent>");
        greetings();
        school();
        money();
        fitness();
        plans();
        farewell();
    }
    public static void toDistantRelatives() {
        letterHead();
        System.out.println("My favorite relative");
        greetings();
        school();
        hobbies();
        plans();
        farewell();
    }
    public static void toFriendsAndAcquaintances() {
        letterHead();
        System.out.println("<Name>");
        greetings();
        school();
        hobbies();
        fitness();
        farewell();
    }

//Five different things I would talk to them about.

    public static void school() {
        System.out.println("As of right now, I am enrolled in school. I am taking CS&, Math 142, and two PE classes.");
    }
    public static void money() {
        System.out.println("I'm still riddled with debt from my younger years, but after my degree, I have high hopes for the future!");
    }
    public static void hobbies() {
        System.out.println("Since I started coding and playing the guitar, I have seen significant improvements.\n" +
                "I've learned 50+ easy to intermediate songs so far, and have set up a solid plan to learn Java.");
    }
    public static void fitness() {
        System.out.println("Since I started walking more and lifting weights, I've been noticing improvement in my mood.\n" +
                "It's like night and day! What do you do to keep your mood up in these strange times?");
    }
    public static void plans() {
        System.out.println("How have things been since we last talked? Oh- Could you recommend me a book to read?");
    }

//Extra things to make it cleaner and reduce repeating lines.

    public static void letterHead() {
        System.out.println("From: N. J. Gregory");
        System.out.print("To: ");
    }
    public static void greetings() {
        System.out.println();
        System.out.println();
        System.out.print("    Greetings! ");
    }
    public static void farewell() {
        System.out.println("Anyways, we need to catch up sometime. Write me back!\n\n" +
                "    N. J. Gregory");
        System.out.println();
    }
}
/*
Sometimes we write similar letters to different people.
For example, you might write to your parents to tell them about your classes and your friends and to ask for money;
you might write to a friend about your love life, your classes, and your hobbies;
and you might write to your brother about your hobbies and your friends and to ask for money.
Write a program that prints similar letters such as these to three people of your choice.
Each letter should have at least one paragraph in common with each of the other letters.
Your main program should have three method calls, one for each of the people to whom you are writing.
Try to isolate repeated tasks into methods.
 */