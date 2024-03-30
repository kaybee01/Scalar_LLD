package DP6_Decorator;

import DP6_Decorator.addon.Milk;
import DP6_Decorator.addon.WhippedCream;

public class Main {
    public static void main(String[] args) {
        Beverage b =new Espresso();
        System.out.println("Normal : "+b.getPrice());
        b =new Milk(b);
        System.out.println("Addon 1 : "+b.getPrice());
        b =new WhippedCream(b);
        System.out.println("Addon 2 : "+b.getPrice());

    }
}
