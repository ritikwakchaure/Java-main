package tester;

import com.app.fruits.Fruit;
import com.app.fruits.Apple;
import com.app.fruits.Mango;
import com.app.fruits.Orange;

import java.util.ArrayList;
import java.util.Scanner;


public class FruitBasket {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter basket size: ");
        int n = sc.nextInt();

        ArrayList<Fruit> basket = new ArrayList<>();

        while (true) {
            System.out.println("\nOptions:");
            System.out.println("1. Add Mango");
            System.out.println("2. Add Orange");
            System.out.println("3. Add Apple");
            System.out.println("4. Display Fruits");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            if (choice == 5) break;

            switch (choice) {
                case 1:+
                    if (basket.size() < n) basket.add(new Mango());
                    else System.out.println("Basket full!");
                    break;
                case 2:
                    if (basket.size() < n) basket.add(new Orange());
                    else System.out.println("Basket full!");
                    break;
                case 3:
                    if (basket.size() < n) basket.add(new Apple());
                    else System.out.println("Basket full!");
                    break;
                case 4:
                    for (Fruit f : basket) {
                        System.out.println("\nFruit: " + f.getName() + ", Taste: " + f.taste());
                        if (f instanceof Mango) ((Mango) f).pulp();
                        else if (f instanceof Orange) ((Orange) f).juice();
                        else if (f instanceof Apple) ((Apple) f).jam();
                    }
                    break;
                default:
                    System.out.println("Invalid option!");
            }
        }

        sc.close();
    }
}
