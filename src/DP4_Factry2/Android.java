package DP4_Factry2;

public class Android extends platform{

    public UIComponentFactory getFactory(){
        return new AndroidUIComponentFactory();
    }

}
