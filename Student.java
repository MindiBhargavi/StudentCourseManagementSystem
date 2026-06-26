package com.assing2;

public class Student extends Person implements Display {

    private int studentId;
    private String collegeName;
    private String courseName;

    // Constructor
    public Student(int studentId, String name, String email,
                   String phoneNumber, String collegeName) {

        super(name, email, phoneNumber);

        this.studentId = studentId;
        this.collegeName = collegeName;
        this.courseName = "Not Assigned";
    }

    // Getters
    public int getStudentId() {
        return studentId;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public String getCourseName() {
        return courseName;
    }

    // Setters
    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public void displayDetails() {

        System.out.println("\n===== Student Details =====");
        System.out.println("Student ID : " + studentId);
        System.out.println("Name       : " + getName());
        System.out.println("Email      : " + getEmail());
        System.out.println("Phone      : " + getPhoneNumber());
        System.out.println("College    : " + collegeName);
        System.out.println("Course     : " + courseName);
    }
}