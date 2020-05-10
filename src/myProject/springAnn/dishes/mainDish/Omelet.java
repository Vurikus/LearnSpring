package myProject.springAnn.dishes.mainDish;

import myProject.springAnn.dishes.interfaces.IDish;
import myProject.springAnn.dishes.interfaces.IMainDish;

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
