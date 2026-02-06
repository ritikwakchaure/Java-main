package com.app.core;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class Employee {
    private int empID;
    private String firstName;
    private String lastName;
    private String email;
    private String depId;
    private Date joinDate;
    private double salary;

    //    add SDF for parsing  parsing(string ---->) n format(Date--> String)
    public static SimpleDateFormat sdf;
//static init :for inting sdf: day/mon/yr --pattern

    static {
        sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("static block executed");
    }


    public Employee(int empID, String firstName, String lastName, String email, String depId, double salary, Date jionDate) {
        this.empID = empID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.depId = depId;
        this.salary = salary;
        this.joinDate = jionDate;
    }

    public Employee() {

    }
    //override toString

    @Override
    public String toString() {
        return "Employee{" +
                "empID=" + empID +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", depId='" + depId + '\'' +
                ", joinDate=" + sdf.format(joinDate) +
                ", salary=" + salary +
                '}';
    }

    //override equals for replacing ref equality by content equality(pK:unique ID--empId
    public boolean equals(Object o) {
        System.out.println("in emp equals");
        if (o instanceof Employee) {
            return this.empID == ((Employee) o).empID;

        }
        return false;
    }
}
