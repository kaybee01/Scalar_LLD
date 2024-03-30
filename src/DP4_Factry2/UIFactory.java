package DP4_Factry2;

public class UIFactory {

    public static UIComponentFactory decideFactory(String p){
        if(p.equals("Android")){
            return new AndroidUIComponentFactory();
        } else if (p.equals("Ios")) {
            return new IosUIComponentFactory();
        }else return null;
    }
}
