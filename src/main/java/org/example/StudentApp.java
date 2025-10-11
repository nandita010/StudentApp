package org.example;
import java.util.Scanner;
import java.util.ArrayList;

public class StudentApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        System.out.println("Please enter the number of students: ");
          int count = sc.nextInt();
          sc.nextInt();


        int i = 0;
        while(i < count) {

            System.out.println("Please enter your name: ");
            String name = sc.nextLine();

            System.out.println("Please enter your email: ");
            String email = sc.nextLine();

            System.out.println("Please enter your Student ID: ");
            String studentID = sc.nextLine();

            Student student1 = new Student();

            i++;
            student1.setName(name);
            student1.setEmail(email);
            student1.setStudentID(studentID);

        }


    }
}
