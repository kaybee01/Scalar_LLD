package DP4_Factry2;

public class platform {

    void theme(){

    }
    public UIComponentFactory getFactory(String p){

        //When no UIFactory was used
//        return  null;

        return UIFactory.decideFactory(p);
    }
}
