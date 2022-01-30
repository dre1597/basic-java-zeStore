package model;

public class Costumer {
  private String name;
  private int id;

  public Costumer(String name, int id) {
    this.name = name;
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getId() {
    return this.id;
  }

  @Override
  public String toString() {
    return "\nCostumer name: " + this.name +
        "\nCostumer id: " + this.id;
  }
}
