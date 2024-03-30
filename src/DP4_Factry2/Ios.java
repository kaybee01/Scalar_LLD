package DP4_Factry2;

public class Ios extends platform{

    public UIComponentFactory getFactory(){
        return new IosUIComponentFactory();
    }
}
