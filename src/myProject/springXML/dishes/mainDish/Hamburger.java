package myProject.springXML.dishes.mainDish;

import myProject.springXML.dishes.interfaces.IDish;
import myProject.springXML.dishes.interfaces.IMainDish;

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
