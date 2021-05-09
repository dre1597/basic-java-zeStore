package zeStore;

public class Executive extends Employee implements Authentication {

    private Authentificator fiscalize;

    public Executive(String name, double salary, int password) { 
        super(name, salary);
        this.fiscalize.setPassword(password);
    }

    public double getBonusSalary() {
        return super.getBonusSalary() + super.getSalary() * 0.5;
    }
    public String toString() {
        return "\nI'm a Executive" + super.toString();
    }

    public void setPassword(int password) {
        this.fiscalize.setPassword(password);
    }

    public boolean enterSystem(int password) {
        return this.fiscalize.authenticate(password);
    }
}
