package DP4_Factry2;

import DP4_Factry2.buttom.Menu;
import DP4_Factry2.menu.Button;


public class main {

    public static void main(String[] args) {
        //platform p = new Android();
        UIFactory p = new UIFactory();

        //UIComponentFactory f = p.getFactory("Ios");
        UIComponentFactory f = p.decideFactory("Ios");
        Button b = f.createButton();
        b.click();
        Menu m =f.createMenu();
        m.expand();
    }
}
