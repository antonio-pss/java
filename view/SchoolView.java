package view;

import model.Course;
import model.Student;

import java.util.Scanner;

public class SchoolView {
    Scanner scanner = new Scanner(System.in);

    public void menu() {
        int option;
        StudentController;
        CourseController;

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
                    course.menu();
                    break;
                case 2:
                    student.menu();
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
            System.out.println("\nMenu: ");
            System.out.println("1. Add Student");
            System.out.println("2. Edit Student");
            System.out.println("3. Register Course");
            System.out.println("4. Cancel Course");
            System.out.println("5. List Courses");
            System.out.println("0. Back");

            System.out.print("Enter your option: ");
            option = scanner.nextInt();

            switch(option){
                case 1:
                    //add
                    break;
                case 2:
                    //edit
                    break;
                case 3:
                    //register
                    break;
                case 4:
                    //cancel
                    break;
                case 5:
                    //list course
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
            System.out.println("\nMenu: ");
            System.out.println("1. Add Course");
            System.out.println("2. Edit Course");
            System.out.println("3. List Courses");
            System.out.println("0. Back");

            System.out.print("Enter your option: ");
            option = scanner.nextInt();

            switch(option){
                case 1:
                    //add
                    break;
                case 2:
                    //edit
                    break;
                case 3:
                    //list
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
