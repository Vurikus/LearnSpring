package myProject.OOP.ingestion;

import myProject.OOP.dishes.interfaces.IDrinks;
import myProject.OOP.dishes.interfaces.IMainDish;
import myProject.OOP.dishes.interfaces.ISalat;

public class Dinner implements Ingestion{
    //Field
    private IMainDish firstMainDish;
    private IMainDish secondMainDish;
    private ISalat salat;
    private IDrinks drink;

    //Constructor

    //Function

    public IMainDish getFirstMainDish() {
        return null;
    }

    public IMainDish getSecondMainDish() {
        return null;
    }

    public ISalat getSalat() {
        return null;
    }

    public IDrinks getDrink() {
        return null;
    }

    @Override
    public String getNamesDishes() {
        return null;
    }
}
