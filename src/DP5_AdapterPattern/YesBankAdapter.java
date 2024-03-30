package DP5_AdapterPattern;

import DP5_AdapterPattern.banks.YesBank;

public class YesBankAdapter implements  Bank{

    YesBank yb = new YesBank();
    @Override
    public int getBalance() {
        return yb.checkBalance();
    }
}
