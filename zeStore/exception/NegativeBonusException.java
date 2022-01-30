package exception;

public class NegativeBonusException extends RuntimeException {
  public NegativeBonusException(String msg) {
    super(msg);
  }
}
