package model;

import exception.InsufficientBonusException;
import exception.NegativeBonusException;


public class Account {
    private Costumer owner;
    private int branchCod = 4242;
    private double bonus = 100;
    private static int totalAccounts = 0;

    public Account(String name, double bonus) {
        totalAccounts++;

        this.owner = new Costumer(name, 10000 + totalAccounts);

        if(bonus > 0) this.bonus = bonus;
        else this.bonus = 100;
    }
    public Account(String name, int branchCod) {
        totalAccounts++;

        this.owner = new Costumer(name, 100 + totalAccounts);

        if(branchCod > 0) this.branchCod = branchCod;
        else this.branchCod = 4242;
    }

    public Account(String name, int branchCod, double bonus) {
        totalAccounts++;

        this.owner = new Costumer(name, 100 + totalAccounts);

        if(branchCod > 0) this.branchCod = branchCod;
        else this.branchCod = 4141;

        if(bonus > 0) this.bonus = bonus;
        else this.bonus = 100;
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }

    public String getCostumerName() {
        return this.owner.getName();
    }

    public int getCostumerId() {
        return this.owner.getId();
    }

    public void setCostumerName(String name) {
        this.owner.setName(name);
    }

    public int getBranchCod() {
        return this.branchCod;
    }
    public double getBonus() {
        return this.bonus;
    }
    protected void setBonus(double bonus) {
        this.bonus = bonus;
    }
    
    public void addBonus(double bonus) {
        if(bonus < 0) {
            throw new NegativeBonusException("Can't add a negative or a null bonus");
        }
        this.bonus += bonus;
    }

    public void useBonus(double bonus) {
        if(this.bonus < bonus) {
            throw new InsufficientBonusException("You have only " + this.bonus + " in bonus , can't use " + bonus);
        }
        this.bonus -= bonus;
    }

    public void giveBonus(double bonus, Account destiny) {
        this.useBonus(bonus);
        destiny.addBonus(bonus);
    }
    @Override
    public String toString() {
        return this.owner.toString()  +
                "\nBranch code: " + this.branchCod + 
                "\nCostumer bonus: " + this.bonus;
    }
}
