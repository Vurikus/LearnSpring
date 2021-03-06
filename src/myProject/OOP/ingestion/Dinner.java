package myProject.OOP.ingestion;

import myProject.OOP.dishes.drink.Tea;
import myProject.OOP.dishes.interfaces.*;
import myProject.OOP.dishes.mainDish.Potato;
import myProject.OOP.dishes.salat.Olivie;
import myProject.OOP.dishes.sup.ChickenSup;

import java.util.ArrayList;
import java.util.List;

public class Dinner extends Ingestion{
    //Field
    private IMainDish mainDish = new Potato();
    private ISup sup = new ChickenSup();
    private ISalat salat = new Olivie();
    private IDrinks drink = new Tea();

    //Constructor

    //Function


    @Override
    public List<IDish> getDishes() {
        List <IDish> dishes = new ArrayList<>();
        dishes.add(sup);
        dishes.add(mainDish);
        dishes.add(salat);
        dishes.add(drink);
        return dishes;
    }

    public IMainDish getMainDish() {
        return mainDish;
    }

    public void setMainDish(IMainDish mainDish) {
        this.mainDish = mainDish;
    }

    public ISup getSup() {
        return sup;
    }

    public void setSup(ISup sup) {
        this.sup = sup;
    }

    public ISalat getSalat() {
        return salat;
    }

    public void setSalat(ISalat salat) {
        this.salat = salat;
    }

    public IDrinks getDrink() {
        return drink;
    }

    public void setDrink(IDrinks drink) {
        this.drink = drink;
    }


}
