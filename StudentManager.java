package com.assing2;

import java.util.ArrayList;

public class StudentManager {

    private ArrayList<Student> students = new ArrayList<>();

    // Add Student
    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student Added Successfully.");
    }

    // Display All Students
    public void showAllStudents() {

        if (students.isEmpty()) {
            System.out.println("No Students Found.");
            return;
        }

        for (Student student : students) {
            student.displayDetails();
        }
    }

    // Search Student
    public Student searchStudent(int id) {

        for (Student student : students) {

            if (student.getStudentId() == id) {
                return student;
            }
        }

        return null;
    }

    // Display One Student
    public void showStudent(int id) {

        Student student = searchStudent(id);

        if (student != null) {
            student.displayDetails();
        } else {
            System.out.println("Student Not Found.");
        }
    }
}
