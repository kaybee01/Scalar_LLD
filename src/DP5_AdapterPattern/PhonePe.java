package DP5_AdapterPattern;

public class PhonePe {

    Bank b;
    public PhonePe(){
        b =new IciciAdapter();
    }

    public int getBalance(){
        return b.getBalance();
    }
}
