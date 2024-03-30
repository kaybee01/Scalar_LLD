package DP6_Decorator.addon;

import DP6_Decorator.Beverage;

public class WhippedCream implements Addon{

    Beverage b;
    public WhippedCream(Beverage b){
        this.b=b;
    }
    @Override
    public int getPrice() {
        return 40 +b.getPrice();
    }
}
