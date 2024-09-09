package exceptions2;

public class HitDailyLimitException extends Exception {
    public HitDailyLimitException(String message) {
        super(message);
    }
}
