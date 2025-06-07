package ec.edu.espe.soap.exception;

public class TrackingException extends RuntimeException {
    private int errorCode;
    private String invalidField;

    public TrackingException(int errorCode, String message, String invalidField) {
        super(message);
        this.errorCode = errorCode;
        this.invalidField = invalidField;
    }

    // Getters y Setters
}
