package model;

import utils.Authentication;
import utils.Authentificator;


public class Manager extends Employee implements Authentication{

    private Authentificator fiscalize;

    public Manager(String name, double salary, int password) {
        super(name, salary);
        this.fiscalize.setPassword(password);
    }
    
    public double getBonusSalary() {
        return super.getBonusSalary() + super.getSalary() * 0.3;
    }
    @Override
    public String toString() {
        return "\nI'm a Manager" + super.toString();
    }

    public void setPassword(int password) {
        this.fiscalize.setPassword(password);
    }

    public boolean enterSystem(int password) {
        return this.fiscalize.authenticate(password);
    }
}
