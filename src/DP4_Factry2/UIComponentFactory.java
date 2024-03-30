package DP4_Factry2;

import DP4_Factry2.buttom.Menu;
import DP4_Factry2.menu.Button;

public interface UIComponentFactory {

    public Button createButton();
    public Menu createMenu();
}
