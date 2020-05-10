package myProject.springAnn.dishes.cake;

import myProject.springAnn.dishes.interfaces.IBakery;
import myProject.springAnn.dishes.interfaces.IDish;

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
