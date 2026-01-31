package utils;

import custom_exceptions.SpeedOutOfBoundException;

public class ValidationRules extends RuntimeException {
    //define speed limit
    public static final int MAX_SPEED;
    public static final int MIN_SPEED;

    static {
        System.out.println("init static blocks");
        MAX_SPEED = 80;
        MIN_SPEED = 30;
    }
    // add a static method for Speed validation

    public static void SpeedValidation(int speed) throws SpeedOutOfBoundException {
        if (speed < MIN_SPEED) {
            throw new SpeedOutOfBoundException("You are Driving to slow");
        }
        if (speed > MAX_SPEED) {
            throw new SpeedOutOfBoundException("You are Driving to fast");
        }

    }
}
