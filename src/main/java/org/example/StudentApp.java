package org.example;
import java.util.Scanner;
import java.util.ArrayList;

public class StudentApp {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the number of students: ");
          count = sc.nextInt();

        while(count <= 3) {
        }

        System.out.println("Please enter your name: ");
        String name= sc.nextLine();

        System.out.println("Please enter your email: ");
        String email= sc.nextLine();

        System.out.println("Please enter your Student ID: ");
        String studentID= sc.nextLine();



    }
}
