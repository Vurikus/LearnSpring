package myProject.OOP.ingestion;

import myProject.OOP.dishes.cake.LemonCake;
import myProject.OOP.dishes.drink.Tea;
import myProject.OOP.dishes.interfaces.IBakery;
import myProject.OOP.dishes.interfaces.IDrinks;
import myProject.OOP.dishes.interfaces.IMainDish;
import myProject.OOP.dishes.mainDish.Omelet;

public class Breakfast implements Ingestion {
    //Field
    private IMainDish mainDish;
    private IDrinks drink;
    private IBakery bakery;

    //Constructor

    public Breakfast() {
        this.mainDish = getMainDish();
        this.bakery = getBakery();
        this.drink = getDrink();
    }


    //Function

    public IMainDish getMainDish() {
        return new Omelet();
    }

    public IDrinks getDrink() {
        return new Tea();
    }

    public IBakery getBakery() {
        return new LemonCake();
    }

    public void setMainDish(IMainDish mainDish) {
        this.mainDish = mainDish;
    }

    public void setDrink(IDrinks drink) {
        this.drink = drink;
    }

    public void setBakery(IBakery bakery) {
        this.bakery = bakery;
    }

    @Override
    public String getNamesDishes() {
        String nameDishes = "1. " + mainDish.toString();
        return nameDishes;
    }
}