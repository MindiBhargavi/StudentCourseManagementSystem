package com.assing2;

public class Course implements Display {

    private String courseId;
    private String courseName;
    private String duration;
    private String trainerName;
    private double fees;

    // Constructor
    public Course(String courseId, String courseName,
                  String duration, String trainerName, double fees) {

        this.courseId = courseId;
        this.courseName = courseName;
        this.duration = duration;
        this.trainerName = trainerName;
        this.fees = fees;
    }

    // Getters
    public String getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getDuration() {
        return duration;
    }

    public String getTrainerName() {
        return trainerName;
    }

    public double getFees() {
        return fees;
    }

    // Setters
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public void setTrainerName(String trainerName) {
        this.trainerName = trainerName;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }

    @Override
    public void displayDetails() {

        System.out.println("\n===== Course Details =====");
        System.out.println("Course ID   : " + courseId);
        System.out.println("Course Name : " + courseName);
        System.out.println("Duration    : " + duration);
        System.out.println("Trainer     : " + trainerName);
        System.out.println("Fees        : " + fees);
    }
}