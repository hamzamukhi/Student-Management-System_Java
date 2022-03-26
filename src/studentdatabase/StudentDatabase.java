package studentdatabase;

import java.util.Scanner;

public class StudentDatabase {
    public static void main(String[] args) {

        /**
         * Ask how many students you want to add.
         */
        System.out.println("Enter number of new Students to enroll: ");
        Scanner in = new Scanner(System.in);
        int numOfStudents = in.nextInt();
        Student[] students = new Student[numOfStudents];

        //create number of new Students
        for (int n = 0; n < numOfStudents; n++) {
            students[n] = new Student();
            students[n].enroll();
            students[n].payTuition();
        }

        for (int n = 0; n < numOfStudents; n++) {
            System.out.println(students[n].toString());
        }
//        System.out.println(students[0].toString());
//        System.out.println(students[1].toString());

    }
}
