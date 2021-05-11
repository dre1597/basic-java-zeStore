package utils;

import java.util.Comparator;
import model.Account;

//We can define the natural order using the interface Comparable instead of create a Comparator.
public class CostumerNameComparator implements Comparator<Account>{

    @Override
    public int compare(Account o1, Account o2) {
        String name1 = o1.getCostumerName();
        String name2 = o2.getCostumerName();
        return name1.compareTo(name2);
    }
    
}
