package DP6_Decorator.addon;

import DP6_Decorator.Beverage;

public class Milk implements Addon{

    Beverage b;
    public Milk(Beverage b){
        this.b =b;
    }
    @Override
    public int getPrice() {
        return 30 + b.getPrice();
    }
}
