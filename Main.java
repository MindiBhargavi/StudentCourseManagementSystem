package com.assing2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StudentManager studentManager = new StudentManager();
        CourseManager courseManager = new CourseManager();

        int choice;

        do {

            System.out.println("\n========== STUDENT COURSE MANAGEMENT SYSTEM ==========");
            System.out.println("1. Add Student");
            System.out.println("2. Add Course");
            System.out.println("3. Assign Course to Student");
            System.out.println("4. Show Student Details");
            System.out.println("5. Show Course Details");
            System.out.println("6. Show All Students");
            System.out.println("7. Show All Courses");
            System.out.println("8. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter Student ID: ");
                    int studentId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Student Name: ");
                    String studentName = sc.nextLine();

                    System.out.print("Enter Email: ");
                    String email = sc.nextLine();

                    System.out.print("Enter Phone Number: ");
                    String phone = sc.nextLine();

                    System.out.print("Enter College Name: ");
                    String college = sc.nextLine();

                    Student student = new Student(
                            studentId,
                            studentName,
                            email,
                            phone,
                            college);

                    studentManager.addStudent(student);

                    break;

                case 2:

                    System.out.print("Enter Course ID: ");
                    String courseId = sc.nextLine();

                    System.out.print("Enter Course Name: ");
                    String courseName = sc.nextLine();

                    System.out.print("Enter Duration: ");
                    String duration = sc.nextLine();

                    System.out.print("Enter Trainer Name: ");
                    String trainer = sc.nextLine();

                    System.out.print("Enter Fees: ");
                    double fees = sc.nextDouble();
                    sc.nextLine();

                    Course course = new Course(
                            courseId,
                            courseName,
                            duration,
                            trainer,
                            fees);

                    courseManager.addCourse(course);

                    break;

                case 3:

                    System.out.print("Enter Student ID: ");
                    int sid = sc.nextInt();
                    sc.nextLine();

                    Student s = studentManager.searchStudent(sid);

                    if (s == null) {
                        System.out.println("Student Not Found.");
                        break;
                    }

                    System.out.print("Enter Course ID: ");
                    String cid = sc.nextLine();

                    Course c = courseManager.searchCourse(cid);

                    if (c == null) {
                        System.out.println("Course Not Found.");
                        break;
                    }

                    s.setCourseName(c.getCourseName());

                    System.out.println("Course Assigned Successfully.");

                    break;

                case 4:

                    System.out.print("Enter Student ID: ");
                    int id = sc.nextInt();

                    studentManager.showStudent(id);

                    break;

                case 5:

                    sc.nextLine();

                    System.out.print("Enter Course ID: ");
                    String id2 = sc.nextLine();

                    courseManager.showCourse(id2);

                    break;

                case 6:

                    studentManager.showAllStudents();

                    break;

                case 7:

                    courseManager.showAllCourses();

                    break;

                case 8:

                    System.out.println("Thank You!");
                    break;

                default:

                    System.out.println("Invalid Choice.");

            }

        } while (choice != 8);

        sc.close();
    }
}
