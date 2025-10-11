package org.example;
import java.util.Scanner;
import java.util.ArrayList;

public class StudentApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        //Ask for the number of students
        System.out.println("Please enter the number of students: ");
          int count = sc.nextInt();
          sc.nextLine();

        //Using while loop to enter details of the student
        int i = 0;
        while(i < count) {

            System.out.println("Please enter your name: ");
            String name = sc.nextLine();

            //Using boolean to check whether email is unique or not
            String email;
            while (true) { // repeat until email is unique
                System.out.println("Please enter your email: ");
                email = sc.nextLine().trim().toLowerCase(); // normalize

                boolean exists = false;
                for (Student s : students) {
                    if (s.getEmail().trim().toLowerCase().equals(email)) {
                        exists = true;
                        break;
                    }
                }

                if (exists) {
                    System.out.println("That email already exists. Please use another one. ");
                } else {
                    break; // unique email found, exit the inner loop
                }
            }

            System.out.println("Please enter your Student ID: ");
            String studentID = sc.nextLine();

            Student student1 = new Student();

            student1.setName(name);
            student1.setEmail(email);
            student1.setStudentID(studentID);

            students.add(student1);
            i++;

        }

        System.out.println("\nStudent List: ");
        for (Student s : students) {        //Using for loop to print each students' details.
            System.out.println(s);
        }
    }
}
