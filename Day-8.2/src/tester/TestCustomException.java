package tester;

import custom_exceptions.SpeedOutOfBoundException;

import java.util.Scanner;

import static utils.ValidationRules.SpeedValidation;

public class TestCustomException {
    public static void main(String[] args) throws SpeedOutOfBoundException {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Ënter Speed");
            SpeedValidation(sc.nextInt());
        }
    }
}
