package DP4_Factry2;

import DP4_Factry2.buttom.IosMenu;
import DP4_Factry2.buttom.Menu;
import DP4_Factry2.menu.Button;
import DP4_Factry2.menu.IosButton;

public class IosUIComponentFactory implements UIComponentFactory{
    @Override
    public Button createButton() {
        return new IosButton();
    }

    @Override
    public Menu createMenu() {
        return new IosMenu();
    }
}
