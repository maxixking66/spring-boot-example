package ir.maktab56.springbootexample.exception;

public class AccessDeniedRunTimeException extends RuntimeException {

    public AccessDeniedRunTimeException(String message) {
        super(message);
    }
}
