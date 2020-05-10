package myProject.OOP.ingestion;

import myProject.OOP.dishes.interfaces.IBakery;
import myProject.OOP.dishes.interfaces.IDrinks;
import myProject.OOP.dishes.interfaces.IMainDish;

public class Supper implements Ingestion{
    //Field
    private IMainDish mainDish;
    private IDrinks drink;
    private IBakery cake;

    //Constructor

    //Function

    public IMainDish getMainDish() {
        return null;
    }

    public IDrinks getDrink() {
        return null;
    }

    public IBakery getCake() {
        return null;
    }

    @Override
    public String getNamesDishes() {
        return null;
    }
}
