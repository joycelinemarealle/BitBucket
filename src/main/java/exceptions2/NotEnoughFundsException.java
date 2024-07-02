package exceptions2;

public class NotEnoughFundsException extends Exception {
    public NotEnoughFundsException(){
        super();
    }
    public NotEnoughFundsException(String message) {
        super(message);
    }
    public NotEnoughFundsException(String message, Throwable cause) {
        super(message, cause);
    }
}
