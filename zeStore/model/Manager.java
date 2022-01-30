package model;

import utils.Authentication;
import utils.Authenticator;

public class Manager extends Employee implements Authentication {

  private Authenticator inspect;

  public Manager(String name, double salary, int password) {
    super(name, salary);
    this.inspect.setPassword(password);
  }

  @Override
  public double getBonusSalary() {
    return super.getBonusSalary() + super.getSalary() * 0.3;
  }

  @Override
  public String toString() {
    return "\nI'm a Manager" + super.toString();
  }

  public void setPassword(int password) {
    this.inspect.setPassword(password);
  }

  public boolean enterSystem(int password) {
    return this.inspect.authenticate(password);
  }
}
