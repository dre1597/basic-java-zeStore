package zeStore;

public class InsufficientBonusException extends RuntimeException{
    public InsufficientBonusException(String msg) {
        super(msg);
    }
}
