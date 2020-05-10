package myProject.springAnn.dishes.mainDish;

import myProject.springAnn.dishes.interfaces.IDish;
import myProject.springAnn.dishes.interfaces.IMainDish;

public class Hamburger implements IDish, IMainDish {
    //Field

    //Constructor

    //Function

    @Override
    public int kkal() {
        return 570;
    }

    @Override
    public String toString() {
        return "Hamburger";
    }
}
