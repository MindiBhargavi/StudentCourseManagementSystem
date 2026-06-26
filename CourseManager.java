package com.assing2;

import java.util.ArrayList;

public class CourseManager {

    private ArrayList<Course> courses = new ArrayList<>();

    // Add Course
    public void addCourse(Course course) {

        courses.add(course);
        System.out.println("Course Added Successfully.");
    }

    // Display All Courses
    public void showAllCourses() {

        if (courses.isEmpty()) {
            System.out.println("No Courses Found.");
            return;
        }

        for (Course course : courses) {
            course.displayDetails();
        }
    }

    // Search Course
    public Course searchCourse(String id) {

        for (Course course : courses) {

            if (course.getCourseId().equalsIgnoreCase(id)) {
                return course;
            }
        }

        return null;
    }

    // Display One Course
    public void showCourse(String id) {

        Course course = searchCourse(id);

        if (course != null) {
            course.displayDetails();
        } else {
            System.out.println("Course Not Found.");
        }
    }
}
