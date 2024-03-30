package DP4_Factry2;

import DP4_Factry2.buttom.AndroidMenu;
import DP4_Factry2.buttom.Menu;
import DP4_Factry2.menu.AndroidButton;
import DP4_Factry2.menu.Button;

public class AndroidUIComponentFactory implements UIComponentFactory{
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }
}
