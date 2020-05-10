package myProject.OOP.dishes.mainDish;

import myProject.OOP.dishes.interfaces.IDish;
import myProject.OOP.dishes.interfaces.IMainDish;

public class Omelet implements IDish, IMainDish {

    //Field

    //Constructor

    //Function
    @Override
    public int kkal() {
        return 150;
    }

    @Override
    public String toString() {
        return "Omelet";
    }
}
