package studentdatabase;

import java.util.Scanner;

public class Student {

    /**
     * Constructor: prompt user to enter student's name and year.
     * Generate an id.
     * Enroll in courses.
     * View balance.
     * Pay Tuition.
     * Show status.
     */

    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses = "";
    private int tuitionBalance = 0;
    private static int costOfCourse = 15000;
    private static int id = 1000;

    //Constructor
    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Student First Name: ");
        this.firstName = in.nextLine();

        System.out.print("Enter Student Last Name: ");
        this.lastName = in.nextLine();

        System.out.print("1 - Preschool\n2 - Primary\n3 - Middle\n4 - High\nEnter Student class level:  ");
        this.gradeYear = in.nextInt();

        setStudentId();


    }

    //Generating an ID
    private void setStudentId() {
        //Grade level + ID
        id++;
        this.studentID = gradeYear + "" + id;
    }

    // Enroll in Courses
    public void enroll() {
        //get inside a loop, user hits 0
        do {
            System.out.print("Enter Course to Enroll (Q to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q")) {
                courses = courses + "\n " + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            }
            else {
                break;
            }
        } while (1 != 0);
    }

    //View Balance
    public void viewBalance() {
        System.out.println("Your Balance is: Rs " + tuitionBalance);
    }

    //Pay Tuition
    public void payTuition() {
        viewBalance();
        System.out.print("Enter your Payment: Rs");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of Rs " + payment);
        viewBalance();
    }

    //Show Status
    public String toString() {
        return "Name: " + firstName + " " + lastName +
                "\nGrade Level: " + gradeYear +
                "\nStudent ID: " + studentID +
                "\nCourses Enrolled: " + courses +
                "\nBalance: Rs " + tuitionBalance;
    }

}
