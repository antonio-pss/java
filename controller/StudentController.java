package controller;

import model.Course;
import model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentController {
    private List<Student> students = new ArrayList<>();

    public boolean idExist(String id){
        for (Student student : students) {
            if(student.getId().equals(id)){
                return true;
            }
        }
        return false;
    }

    public void addStudent(Student student) {
        if (!idExist(student.getId())) {
            students.add(student);
            System.out.println("Student added");
        } else {
            System.out.println("Student already exists");
        }
    }

    public void editStudent(String id, Student newStudent) {
        for (Student student : students) {
            if (student.getId().equals(id)) {
                student.setId(newStudent.getId());
                student.setName(newStudent.getName());
                System.out.println("Student edited");
                return;
            }
        }
        System.out.println("Student not found");
    }

    public void registerCourse(Course course, String studentId) {
        for (Student student : students) {
            if (student.getId().equals(studentId)) {
                student.getCourses().add(course);
                System.out.println("Course added");
                return;
            }
        }
        System.out.println("Student not found");
    }

    public void cancelCourse(String courseId, String studentId) {
        for (Student student : students) {
            if (student.getId().equals(studentId)) {
                for (int i=0; i<student.getCourses().size(); i++) {
                    if (student.getCourses().get(i).getId().equals(courseId)) {
                        student.getCourses().remove(i);
                        return;
                    }
                }
                System.out.println("Course not found");
            }
        }
        System.out.println("Student not found");
    }

    public void listCourses(String studentId) {
        for (Student student : students) {
            if (student.getId().equals(studentId)) {
                System.out.println(student.getCourses());
            }
        }
        System.out.println("Student not found");
    }
}
