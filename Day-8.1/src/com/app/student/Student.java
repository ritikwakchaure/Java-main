package com.app.student;

import java.util.Objects;

public class Student {

    private int rollNo;
    private String firstName;
    private String lastName;
    private int gpa;
    private String subject;

    public Student(int rollNo, String firstName, String lastName, double gpa) {
        super();
        this.rollNo = rollNo;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = (int) gpa;

    }

    public String toString() {
        return firstName + " " + lastName + " " + gpa + " " + rollNo;
    }

    //replay ref equality by content(rollNo n subjects)
    @Override
    public boolean equals(Object o) {
        System.out.println("int  student");
        if (o instanceof Student) {
            Student s = (Student) o;
            return this.rollNo == s.rollNo && this.subject.equals(s.subject);

        }
        return false;

    }

}
