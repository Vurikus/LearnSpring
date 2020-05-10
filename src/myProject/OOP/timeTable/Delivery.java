package myProject.OOP.timeTable;

import myProject.OOP.dishes.interfaces.IMainDish;
import myProject.OOP.dishes.mainDish.Omelet;
import myProject.OOP.ingestion.Breakfast;
import myProject.OOP.ingestion.Ingestion;

public class Delivery {
    //Field
    private static int enterDay = CallOfDay.getEnterDay();
    private static int enterIngestion = CallOfDay.getEnterIngestion();
    private Ingestion ingestion;
    private IMainDish mainDish = new Omelet();


    //Constructor

    //Function
    public Ingestion getIngestion (){
        switch (enterDay){
            case 1: {
                putBreakfast();
                break;
            }
            case 2: {
                putDinner();
                break;
            }
            case 3: {
                putSupper();
                break;
            }
            default:
                System.out.println("Error");
        }
        return ingestion;
    }


    private void putBreakfast (){
        ingestion = new Breakfast();
        ((Breakfast) ingestion).setMainDish(mainDish);
    }

    private void putDinner() {
    }

    private void putSupper() {
    }

}
