package myProject.springAnn.dishes.sup;

import myProject.springAnn.dishes.interfaces.IDish;
import myProject.springAnn.dishes.interfaces.ISup;

public class ChickenSup implements IDish, ISup {
    //Field

    //Constructor

    //Function

    @Override
    public int kkal() {
        return 200;
    }

    @Override
    public String toString() {
        return "Chicken Sup";
    }
}
