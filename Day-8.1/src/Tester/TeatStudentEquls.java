package Tester;

import com.app.student.Student;

public class TeatStudentEquls {
    public static void main(String[] args) {
        Student s1 = new Student(101, "React", "a1", 7.5);
        Student s2 = new Student(102, "React", "a2", 7.5);
        Student s3 = new Student(103, "React", "a3", 7.5);

        System.out.println(s2.equals(s1));
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s2));


    }

}
