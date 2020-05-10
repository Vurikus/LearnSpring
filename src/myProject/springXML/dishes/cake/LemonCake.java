package myProject.springXML.dishes.cake;

import myProject.springXML.dishes.interfaces.IBakery;
import myProject.springXML.dishes.interfaces.IDish;

public class LemonCake implements IDish, IBakery {
    //Field

    //Constructor

    //Function

    @Override
    public int kkal() {
        return 245;
    }

    @Override
    public String toString() {
        return "Lemon Cake";
    }
}
