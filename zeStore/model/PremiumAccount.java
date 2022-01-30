package model;

import exception.InsufficientBonusException;
import exception.NegativeBonusException;

public class PremiumAccount extends Account {
  public PremiumAccount(String name, int branchCod, double bonus) {
    super(name, branchCod, bonus);
  }

  @Override
  public void addBonus(double bonus) {
    double actualBonus = super.getBonus();

    if (bonus < 0) {
      throw new NegativeBonusException("Can't add a negative or a null bonus");
    }
    actualBonus += (bonus + 25);
    super.setBonus(actualBonus);
  }

  @Override
  public void useBonus(double bonus) {
    double actualBonus = super.getBonus();
    if (actualBonus < bonus) {
      throw new InsufficientBonusException("You have only " + super.getBonus() + " in bonus , can't use " + bonus);
    }
    actualBonus -= (bonus + 25);
    super.setBonus(actualBonus);
  }
}
