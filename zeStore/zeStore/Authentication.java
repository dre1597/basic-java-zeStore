package zeStore;

public interface Authentication {
    public abstract void setPassword(int password);

    public abstract boolean enterSystem(int password);
}
