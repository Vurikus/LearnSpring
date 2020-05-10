package myProject.springXML.timeTable;

import myProject.springXML.dishes.interfaces.IBakery;
import myProject.springXML.dishes.interfaces.IDrinks;
import myProject.springXML.dishes.interfaces.IMainDish;
import myProject.springXML.ingestion.Breakfast;

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
