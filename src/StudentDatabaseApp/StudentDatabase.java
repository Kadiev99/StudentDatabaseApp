package StudentDatabaseApp;

import java.util.Scanner;

public class StudentDatabase {
    public static void main(String[] args) {

         // You are a Database Administrator for a university
        // and need to crate an application to manage student enrollments and balance



        //Ask how many students we want to add
        System.out.print("Enter number of new students to enroll: ");
        Scanner in = new Scanner(System.in);
        int numberOfStudents = in.nextInt();
        Student[] students = new Student[numberOfStudents];

        //Create n number of new students
        for (int n = 0; n < numberOfStudents; n++){
            students[n] = new Student();
            students[n].enroll();
            students[n].payTuition();
        }
        for (int n = 0; n < numberOfStudents; n++){
            System.out.println(students[n].toString());
        }

    }
}
