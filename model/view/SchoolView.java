package model.view;

import model.controller.CourseController;
import model.controller.StudentController;
import model.model.Course;
import model.model.Student;

import java.util.Scanner;

public class SchoolView {
    Scanner scanner = new Scanner(System.in);
    StudentController studentController = new StudentController();
    CourseController courseController = new CourseController();

    public void menu() {
        int option;

        do {
            Student student = new Student();
            Course course = new Course();
            System.out.println("\nMenu: ");
            System.out.println("1. Course Menu");
            System.out.println("2. Student Menu");
            System.out.println("0. Leave");

            System.out.print("Enter your option: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    courseMenu();
                    break;
                case 2:
                    studentMenu();
                case 0:
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }while (option != 0);
    }

    public void studentMenu(){
        int option;

        do {
            Student student = new Student();
            Course course = new Course();

            System.out.println("\nMenu: ");
            System.out.println("1. Add Student");
            System.out.println("2. Edit Student");
            System.out.println("3. Register Course");
            System.out.println("4. Cancel Course");
            System.out.println("5. List Courses");
            System.out.println("6. List Students");
            System.out.println("0. Back");

            System.out.print("Enter your option: ");
            option = scanner.nextInt();
            scanner.nextLine();

            switch(option){
                case 1:
                    System.out.print("Student ID: ");
                    student.setId(scanner.nextLine());
                    System.out.print("Student Name: ");
                    student.setName(scanner.nextLine());
                    studentController.addStudent(student);
                    break;
                case 2:
                    System.out.print("Student ID: ");
                    student.setId(scanner.nextLine());
                    if (studentController.getStudent(student.getId()) != null) {
                        System.out.print("Student new Name: ");
                        student.setName(scanner.nextLine());
                        studentController.editStudent(student);
                        break;
                    }
                    System.out.print("Student not Found!");
                    break;
                case 3:
                    scanner.nextLine();
                    System.out.print("Student ID: ");
                    student.setId(scanner.nextLine());
                    if ((student = studentController.getStudent(student.getId())) == null) {
                        System.out.println("Student does not exist");
                        break;
                    }
                    System.out.print("Course ID: ");
                    course.setId(scanner.nextLine());
                    if ((course = courseController.getCourse(course.getId())) == null) {
                        System.out.println("Course does not exist");
                        break;
                    }
                    studentController.registerCourse(course, student);
                    break;
                case 4:
                    System.out.print("Student ID: ");
                    student.setId(scanner.nextLine());
                    if (studentController.getStudent(student.getId()) == null) {
                        System.out.println("Student does not exist");
                        break;
                    }
                    System.out.print("Course ID: ");
                    course.setId(scanner.nextLine());
                    if (courseController.getCourse(course.getId()) == null) {
                        System.out.println("Course does not exist");
                        break;
                    }
                    studentController.cancelCourse(course.getId(), student.getId());
                    break;
                case 5:
                    scanner.nextLine();
                    System.out.print("Student ID: ");
                    student.setId(scanner.nextLine());
                    studentController.listCourses(student.getId());
                    break;
                case 6:
                    studentController.listStudents();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }while (option != 0);
    }

    public void courseMenu(){
        int option;

        do {
            Course course = new Course();
            System.out.println("\nMenu: ");
            System.out.println("1. Add Course");
            System.out.println("2. Edit Course");
            System.out.println("3. List Courses");
            System.out.println("0. Back");

            System.out.print("Enter your option: ");
            option = scanner.nextInt();
            scanner.nextLine();

            switch(option){
                case 1:
                    System.out.print("Course ID: ");
                    course.setId(scanner.nextLine());
                    System.out.print("Course Name: ");
                    course.setName(scanner.nextLine());
                    System.out.print("Course Hours: ");
                    course.setHours(scanner.nextLine());
                    courseController.addCourse(course);
                    break;
                case 2:
                    System.out.print("Course ID: ");
                    course.setId(scanner.nextLine());
                    if (courseController.getCourse(course.getId()) == null) {
                        System.out.println("Course does not exist");
                        break;
                    }
                    System.out.print("Course new Name: ");
                    course.setName(scanner.nextLine());
                    System.out.print("Course new Hours: ");
                    course.setHours(scanner.nextLine());
                    courseController.editCourse(course);
                    break;
                case 3:
                    courseController.listCourses();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }while (option != 0);
    }
}
