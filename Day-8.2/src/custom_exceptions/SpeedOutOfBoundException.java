package custom_exceptions;

@SuppressWarnings("serial") // tell javac to suppress the warning
public class SpeedOutOfBoundException extends Exception {


    public SpeedOutOfBoundException(String errMesg) {
        super(errMesg);
    }
}
