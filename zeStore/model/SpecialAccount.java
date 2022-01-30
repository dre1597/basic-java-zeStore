package model;

import exception.InsufficientBonusException;
import exception.NegativeBonusException;

public class SpecialAccount extends Account {
  public SpecialAccount(String name, int branchCod, double bonus) {
    super(name, branchCod, bonus);
  }

  @Override
  public void addBonus(double bonus) {
    double actualBonus = super.getBonus();

    if (bonus < 0) {
      throw new NegativeBonusException("Can't add a negative or a null bonus");
    }
    actualBonus += (bonus + 15);
    super.setBonus(actualBonus);
  }

  @Override
  public void useBonus(double bonus) {
    double actualBonus = super.getBonus();
    if (actualBonus < bonus) {
      throw new InsufficientBonusException("You have only " + super.getBonus() + " in bonus , can't use " + bonus);
    }
    actualBonus -= (bonus + 15);
    super.setBonus(actualBonus);
  }

}
