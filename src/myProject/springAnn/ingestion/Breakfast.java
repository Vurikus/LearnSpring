package myProject.springAnn.ingestion;

import myProject.springAnn.dishes.cake.LemonCake;
import myProject.springAnn.dishes.drink.Tea;
import myProject.springAnn.dishes.interfaces.IBakery;
import myProject.springAnn.dishes.interfaces.IDish;
import myProject.springAnn.dishes.interfaces.IDrinks;
import myProject.springAnn.dishes.interfaces.IMainDish;
import myProject.springAnn.dishes.mainDish.Omelet;

import java.util.ArrayList;
import java.util.List;

public class Breakfast extends Ingestion {
    //Field
    private IMainDish mainDish = new Omelet();
    private IDrinks drink = new Tea();
    private IBakery bakery = new LemonCake();

    //Constructor

    public Breakfast() {

    }

    //Function

    @Override
    public List<IDish> getDishes() {
        List <IDish> dishes = new ArrayList<>();
        dishes.add(mainDish);
        dishes.add(bakery);
        dishes.add(drink);
        return dishes;
    }


    public IMainDish getMainDish() {
        return mainDish;
    }

    public void setMainDish(IMainDish mainDish) {
        this.mainDish = mainDish;
    }

    public IDrinks getDrink() {
        return drink;
    }

    public void setDrink(IDrinks drink) {
        this.drink = drink;
    }

    public IBakery getBakery() {
        return bakery;
    }

    public void setBakery(IBakery bakery) {
        this.bakery = bakery;
    }
}