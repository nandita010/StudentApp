package org.example;

public class Student {
    private String name;
    private String email;
    private String studentID;

    public Student() {
    }

    public Student(String name, String email, String studentID) {
        this.name = name;
        this.email = email;
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getstudentID() {
        return studentID;
    }


    public void setName(String name) {
        this.name = name;
    }


    public void setEmail(String Email) {
        this.email = email;
    }

    ;


    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

@Override
    public String toString() {

        return "Name: " + name + ", Email" + email + ", Student ID: " +studentID;
}

}
