package myProject.springAnn.dishes.mainDish;

import myProject.springAnn.dishes.interfaces.IDish;
import myProject.springAnn.dishes.interfaces.IMainDish;

public class Potato implements IDish, IMainDish {
    //Field

    //Constructor

    //Function

    @Override
    public int kkal() {
        return 480;
    }

    @Override
    public String toString() {
        return "Potato";
    }
}
