package controller;

import model.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseController {
    private List<Course> courses = new ArrayList<Course>();

    public boolean courseExist(String id) {
        for (Course c : courses) {
            if (c.getId().equals(id)) {
                return true;
            }
        }
        return false;
    }

    public Course getCourse(String id) {
        for (Course c : courses) {
            if (c.getId().equals(id)) {
                return c;
            }
        }
        return null;
    }

    public void addCourse(Course course) {
        if (!courseExist(course.getId())) {
            courses.add(course);
            System.out.println("Course Added Successfully");
        } else {
            System.out.println("Course ID already exists");
        }
    }

    public void editCourse(Course newCourse) {
        for (Course course : courses) {
            if (course.getId().equals(newCourse.getId())) {
                course.setName(newCourse.getName());
                course.setHours(newCourse.getHours());
                System.out.println("Course Edited Successfully");
                return;
            }
        }
        System.out.println("Course ID does not exist");
    }

    public void listCourses() {
        for (Course course : courses) {
            System.out.println(course);
        }
    }
}
