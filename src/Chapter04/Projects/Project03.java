package Chapter04.Projects;

import java.util.Scanner;

public class Project03 {
    void main() {
        getApplicantScores();
    }

    public static void getApplicantScores(){
            // Initializes scanner.
        Scanner input = new Scanner(System.in);

        IO.println("""
                Let's compare two students' scores to see who is more qualified.
                (If they don't have a score, enter a 0)
                
                Student 1:""");

            // Prompts for Student 1's grades.
        int student1 = studentScoreCalc(input);

            // Prompts for student 2's grades.
        IO.println("\nStudent 2:");
        int student2 = studentScoreCalc(input);

            // Compares both students.
        if (student1 > student2) {
            IO.println("\nStudent 1 is more qualified.");
        } else if (student2 > student1) {
            IO.println("\nStudent 2 is more qualified.");
        } else {
            IO.println("\nBoth students are equally qualified.");
        }
    }

    public static int studentScoreCalc(Scanner input) {
            // Prompts for student's scores and grades.
        IO.print("GPA = ");
        double gpa = input.nextDouble();
        IO.print("SAT = ");
        int sat = input.nextInt();
        IO.print("ACT = ");
        int act = input.nextInt();

            // Checks if scores are valid before converting them.
        if (gpa < 0 || gpa > 4) {
            throw new IllegalArgumentException("GPA out of bounds.");
        }
        if (sat != 0 && (sat < 400 || sat > 1600)) {
            throw new IllegalArgumentException("SAT out of bounds.");
        }
        if (act != 0 && (act < 1 || act > 36)) {
            throw new IllegalArgumentException("ACT out of bounds.");
        }

            // Converts GPA and ACT to equal values as SAT.
        gpa *= 1000;
        act *= 40;

            // Returns the highest test score plus the GPA.
        return (int)gpa + Math.max(act, sat);
    }
}
/*
Write a program that compares two college applicants. The program should prompt for each student’s
GPA, SAT, and ACT exam scores and report which candidate is more qualified on the basis of these scores.
 */