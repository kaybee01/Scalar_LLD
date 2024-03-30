package DP5_AdapterPattern;

import DP5_AdapterPattern.banks.Icici;

public class IciciAdapter implements Bank{

    Icici ib =new Icici();


    @Override
    public int getBalance() {
        return ib.enquireBalance();
    }
}
