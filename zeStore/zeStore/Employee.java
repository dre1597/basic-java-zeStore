package zeStore;

public abstract class Employee {
    private String name;
    private int id;
    private double salary;

    private static int totalEmployees = 0;

    public Employee(String name, double salary) {
        totalEmployees++;
        this.name = name;
        this.salary = salary;
        this.id = totalEmployees + 100;
    }
    public static int getTotalEmployees() {
        return totalEmployees;
    }
    public String getName() {
        return this.name;
    }
    public int getId() {
        return this.id;
    }  
    public double getSalary() {
        return this.salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getBonusSalary() {
        return this.salary * 0.1;
    }
    public double getTotalSalary() {
        return this.getBonusSalary() + this.salary;
    }
    public String toString() {
        return "\nEmployee name: " + this.name +
                "\nEmployee id: " + this.id + 
                "\nEmployee salary: " + this.salary;
    }
}
