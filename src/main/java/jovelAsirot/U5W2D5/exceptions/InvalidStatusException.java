package jovelAsirot.U5W2D5.exceptions;

public class InvalidStatusException extends RuntimeException {
    public InvalidStatusException(String status) {
        super("The status: " + "'" + status + "'" + " is not valid, it can either be between 'available' - 'assigned' - 'maintenance' - 'dismissed' ಥ‿ಥ");
    }
}
