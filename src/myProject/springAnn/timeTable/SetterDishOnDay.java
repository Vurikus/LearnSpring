package myProject.springAnn.timeTable;

import myProject.springAnn.dishes.interfaces.IBakery;
import myProject.springAnn.dishes.interfaces.IDrinks;
import myProject.springAnn.dishes.interfaces.IMainDish;
import myProject.springAnn.ingestion.Breakfast;

public class SetterDishOnDay {
    //Field

    //Constructor

    //Function
    public void setBreakfast(IMainDish mainDish, IBakery bakery, IDrinks drinks) {
        Breakfast breakfast = new Breakfast();
        breakfast.setMainDish(mainDish);
        breakfast.setBakery(bakery);
        breakfast.setDrink(drinks);
    }
}
