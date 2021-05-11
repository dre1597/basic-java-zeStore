package utils;
import java.util.Comparator;

import model.Account;

public class AccountBonusComparator implements Comparator<Account>{

    @Override
    public int compare(Account o1, Account o2) {
        return Double.compare(o1.getBonus(), o2.getBonus());
    }
    
}
