package myProject.springAnn.ingestion;

import myProject.springAnn.dishes.cake.LemonCake;
import myProject.springAnn.dishes.drink.Tea;
import myProject.springAnn.dishes.interfaces.IBakery;
import myProject.springAnn.dishes.interfaces.IDish;
import myProject.springAnn.dishes.interfaces.IDrinks;
import myProject.springAnn.dishes.interfaces.IMainDish;
import myProject.springAnn.dishes.mainDish.Hamburger;

import java.util.ArrayList;
import java.util.List;

public class Supper extends Ingestion {
    //Field
    private IMainDish mainDish = new Hamburger();
    private IDrinks drink = new Tea();
    private IBakery cake = new LemonCake();

    //Constructor

    //Function


    @Override
    public List<IDish> getDishes() {
        List <IDish> dishes = new ArrayList<>();
        dishes.add(mainDish);
        dishes.add(drink);
        dishes.add(cake);
        return dishes;
    }

    public IMainDish getMainDish() {
        return null;
    }

    public IDrinks getDrink() {
        return null;
    }

    public IBakery getCake() {
        return null;
    }

    public void setMainDish(IMainDish mainDish) {
        this.mainDish = mainDish;
    }

    public void setDrink(IDrinks drink) {
        this.drink = drink;
    }

    public void setCake(IBakery cake) {
        this.cake = cake;
    }


}
