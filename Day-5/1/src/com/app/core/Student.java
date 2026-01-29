package com.app.core;

public class Student extends Person {
    private int gradYear;
    private String course;
    private double fee;
    private int marks;


    public Student(String firstName, String lastName, int gradYear, String course, double fee, int marks) {

        super(firstName, lastName); //
        System.out.println("in student constructor");
        this.gradYear = gradYear;
        this.course = course;
        this.fee = fee;
        this.marks = marks;

    }


    //
//    public Student(String fn, String ln) {
//        super();
//    }
    @Override
    public String toString() {
        return "Student[" + super.toString() + ", Year:" + gradYear + ", Course:" + course +
                ", Fee:₹" + fee + ", Marks:" + marks + "]";
    }

    //     add new functionlity: behavior study
    public void study() {
        System.out.println(super.getFirstName() + "studing in Course" + course);
    }
    //add new functionality


}


