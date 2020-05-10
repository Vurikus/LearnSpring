package myProject.springXML.timeTable;

import myProject.springXML.dishes.interfaces.IDish;
import myProject.springXML.ingestion.Breakfast;
import myProject.springXML.ingestion.Dinner;
import myProject.springXML.ingestion.Ingestion;
import myProject.springXML.ingestion.Supper;

import java.util.List;

public class Delivery {
    //Field
    //private static int enterDay = CallOfDay.getEnterDay();
    private static int enterIngestion = CallOfDay.getEnterIngestion();
    private Ingestion ingestion;
    private List<IDish> dishList;


    //Constructor

    //Function
    public List <IDish> getIngestion (){
        switch (enterIngestion){
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
        return dishList;
    }


    private void putBreakfast (){
        ingestion = new Breakfast();
        dishList = ingestion.getDishes();
    }

    private void putDinner() {
        ingestion = new Dinner();
        dishList = ingestion.getDishes();
    }

    private void putSupper() {
        ingestion = new Supper();
        dishList = ingestion.getDishes();

    }

    public void readDishesList (List <IDish> list){
        for (int i = 0; i < list.size(); i++){
            System.out.println((i+1) + ". " + list.get(i).toString());
        }
    }

}
