package zeStore;

public class SpecialAccount extends Account{
    public SpecialAccount(String name, int branchCod, double bonus) {
        super(name, branchCod, bonus);
    }
    @Override
    public boolean useBonus(double bonus) {
        double actualBonus = super.getBonus();
        if(actualBonus >= bonus) {
            actualBonus-= (bonus + 15);
            super.setBonus(actualBonus);
            return true;
        }
        System.out.println("You dont have enough bonus!");
        return false;
    }
    @Override
    public void addBonus(double bonus) {
        double actualBonus = super.getBonus();

        if(bonus > 0) {
            actualBonus += (bonus + 15);
            super.setBonus(actualBonus);
        }
        else System.out.println("Please enter a positive bonus!");
    }
}
