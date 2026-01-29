package tester;

import java.util.Scanner;

import com.app.geometry.Point;

public class TestPointArray1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many points to plot? ");
        int size = sc.nextInt();

        // Array to store Point objects
        Point[] points = new Point[size];

        // Accept x, y coordinates
        for (int i = 0; i < size; i++) {
            System.out.println("Enter x and y for point " + i);
            int x = sc.nextInt();
            int y = sc.nextInt();
            points[i] = new Point(x, y);
        }

        int choice;

        do {
            System.out.println("\n----- MENU -----");
            System.out.println("1. Show point at index");
            System.out.println("2. Show all points");
            System.out.println("3. Calculate distance between two points");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();




            switch (choice) {

                case 1:
                    System.out.print("Enter index: ");
                    int index = sc.nextInt();

                    if (index >= 0 && index < points.length && points[index] != null) {
                        System.out.println("Point at index " + index + " : "
                                + points[index].getDetails());
                    } else {
                        System.out.println("Invalid index or point not present");
                    }
                    break;

                case 2:
                    System.out.println("All points:");
                    for (int i = 0; i < points.length; i++) {
                        if (points[i] != null)
                            System.out.println(i + " -> " + points[i].getDetails());
                        else
                            System.out.println(i + " -> no point");
                    }
                    break;

                case 3:
                    System.out.print("Enter first index: ");
                    int idx1 = sc.nextInt();
                    System.out.print("Enter second index: ");
                    int idx2 = sc.nextInt();

                    if (idx1 >= 0 && idx1 < points.length &&
                            idx2 >= 0 && idx2 < points.length &&
                            points[idx1] != null && points[idx2] != null) {

                        double distance = points[idx1].calculateDistance(points[idx2]);
                        System.out.println("Distance between points = " + distance);

                    } else {
                        System.out.println("Invalid indices or points not present");
                    }
                    break;

                case 0:
                    System.out.println("Exiting application...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 0);

        sc.close();
    }
}
