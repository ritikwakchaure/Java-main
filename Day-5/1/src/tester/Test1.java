package tester;

import com.app.core.Faculty;
import com.app.core.Person;
import com.app.core.Student;

public class Test1 {
    public static void main(String[] args) {


        Student student1 = new Student("Rama1", "Seth", 2020, "Pg-Dac", 12000, 75);
        System.out.println("-------------------");


//        System.out.println(student1);
        Person p;
        p = student1;
        System.out.println(p);//p.toString

        p = new Faculty("Rama", "Seth", 2020, "React");
        System.out.println(p);
        System.out.println("-------------------");

        Object o = new Student("rutik", "Seth", 2021, "Pg-Dam", 12000, 73);
        System.out.println(o);
        System.out.println("-------------------");

        o = new Faculty("Rama", "Seth", 2020, "React spring Boot");
        System.out.println(o);
        System.out.println("Hello");


    }


}
