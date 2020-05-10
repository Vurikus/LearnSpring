package myProject.OOP.ingestion;

import myProject.OOP.dishes.cake.LemonCake;
import myProject.OOP.dishes.drink.Tea;
import myProject.OOP.dishes.interfaces.IBakery;
import myProject.OOP.dishes.interfaces.IDish;
import myProject.OOP.dishes.interfaces.IDrinks;
import myProject.OOP.dishes.interfaces.IMainDish;
import myProject.OOP.dishes.mainDish.Hamburger;

import java.util.ArrayList;
import java.util.List;

public class Supper extends Ingestion{
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
