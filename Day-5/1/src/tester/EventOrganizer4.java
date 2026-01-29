package tester;

import com.app.core.Faculty;
import com.app.core.Person;
import com.app.core.Student;

import java.util.Scanner;

public class EventOrganizer4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter max no of Partipants");
        Person[] participants = new Person[sc.nextInt()]; // array of refs

        boolean exit = false;
        int counter = 0;
        while (!exit) {
            System.out.println("Options 1.Register Student 2.Resister Faculty 3.Dsiplay Details of all participants 4.Display specific participant details  5. Invoke subclass specific functionality 100.Exit");
            System.out.println("Choose Option");
            switch (sc.nextInt()) {

                case 1: //Student registration
                    if (counter < participants.length) {
                        System.out.println("Enter Student Details: firstName,  lastName,  gradYear, S course,  fee,  marks");
                        participants[counter] = new Student(
                                sc.next(),
                                sc.next(),
                                sc.nextInt(),
                                sc.next(),
                                sc.nextDouble(),
                                sc.nextInt());
                        counter++;
                    } else System.out.println("Event Full");
                    break;
                case 2: // faculty registration
                    if (counter < participants.length) {
                        System.out.println(" firstName,lastName,  yrs,  sme");
                        participants[counter] = new Faculty(
                                sc.next(),
                                sc.next(),
                                sc.nextInt(),
                                sc.next()
                        );
                        counter++;

                    } else {
                        System.out.println("Event Full");
                    }

                    break;
                case 3:  //dispaly details of all participants
                    for (Person p : participants) {
                        System.out.println(p);
                    }
                    break;
                case 4:
                    System.out.println("Seat Number");
                    int index = sc.nextInt() - 1;
                    if (index >= 0 && index < counter) {
                        System.out.println(participants[index]);
                    } else {
                        System.out.println("Invalid Number");
                    }
                    break;
                case 5:
                    System.out.println("Enter the seat number");
                    index = sc.nextInt() - 1;
                    if (index >= 0 && index < counter) {
                        Person p = participants[index];
//                        p.study(); javac resolve of the  reference . there is no "study method define  in person class"
                        //howhow down casting : climbing  down inheritance hierarchy
//                        in order to avoid classcastexpecetion ,Must use itanceof before doing down casting
                        if (p instanceof Student) {
                            ((Student) p).study();
                        } else {

                            ((Faculty) p).teach();
                        }
                    } else {

                        System.out.println("Invalid Number");
                    }
                case 100:
                    break;

                default:
                    throw new IllegalStateException("Unexpected value: " + sc.nextInt());
            }
        }

    }
}


