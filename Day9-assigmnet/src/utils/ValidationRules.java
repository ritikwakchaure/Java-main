package utils;

import custom_exception.EmpHandlingException;

public class ValidationRules {

    // utility method for email validation
    public static String validEmail(String email) throws EmpHandlingException {

        if (email == null || email.isBlank()) {
            throw new EmpHandlingException("Email cannot be null or empty");
        }

        if (!email.contains("@")) {
            throw new EmpHandlingException("Email must contain @");
        }

        if (!email.endsWith(".com")) {
            throw new EmpHandlingException("Email must end with .com");
        }
        return email;
    }
}
