package myProject.springXML.dishes.mainDish;

import myProject.springXML.dishes.interfaces.IDish;
import myProject.springXML.dishes.interfaces.IMainDish;

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
