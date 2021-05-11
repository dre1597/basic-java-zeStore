package utils;

import java.util.Comparator;

import model.Account;

public class CostumerIdComparator implements Comparator<Account>{

    @Override
    public int compare(Account o1, Account o2) {
        return Integer.compare(o1.getCostumerId(), o2.getCostumerId());
    }
}
