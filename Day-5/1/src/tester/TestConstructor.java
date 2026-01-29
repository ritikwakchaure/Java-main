package tester;
import com.app.core.*;
public class TestConstructor {

//    student obj
public static void main(String[] args) {


    Student student1 = new Student("Rama", "Seth", 2020, "Pg-Dac", 12000, 75);
    System.out.println("-------------------");
    Faculty faculty1 = new Faculty("kiran", "Wakcha", 10, "java React NOSQL");

    System.out.println(student1.toString());

    System.out.println(faculty1.toString());
}


}
