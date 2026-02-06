package tester.TestEmp;

import com.app.core.Employee;
import custom_exception.EmpHandlingException;
import utils.ValidationRules;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class TestEmpOrgnation {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

            System.out.println("Enter max number of employees to hire:");
            Employee[] emps = new Employee[sc.nextInt()];

            boolean exit = false;
            int counter = 0;

            while (!exit) {
                System.out.println("\nOptions:");
                System.out.println("1. Hire Employee");
                System.out.println("2. Display All");
                System.out.println("3. Exit");

                try {
                    switch (sc.nextInt()) {

                        case 1:
                            if (counter >= emps.length)
                                throw new EmpHandlingException("❌ Recruiter Over");

                            System.out.println(
                                    "Enter empId firstName lastName email deptId salary joinDate(dd-MM-yyyy)");

                            emps[counter] = new Employee(
                                    sc.nextInt(),
                                    sc.next(),
                                    sc.next(),
                                    ValidationRules.validEmail(sc.next()),
                                    sc.next(),
                                    sc.nextDouble(),
                                    sdf.parse(sc.next())
                            );

                            counter++;
                            System.out.println("✅ Employee hired successfully");
                            break;

                        case 2:
                            for (Employee e : emps) {
                                if (e != null)
                                    System.out.println(e);
                            }
                            break;

                        case 3:
                            exit = true;
                            break;

                        default:
                            System.out.println("❗ Invalid Option");
                    }

                } catch (Exception e) {
                    System.out.println("ERROR : " + e.getMessage());
                }
            }
        }
    }
}
