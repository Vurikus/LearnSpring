package myProject.OOP.timeTable;

import myProject.OOP.dishes.interfaces.IBakery;
import myProject.OOP.dishes.interfaces.IDrinks;
import myProject.OOP.dishes.interfaces.IMainDish;
import myProject.OOP.ingestion.Breakfast;
import myProject.OOP.ingestion.Ingestion;

import java.util.Random;

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
