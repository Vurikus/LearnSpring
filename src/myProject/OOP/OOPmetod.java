package myProject.OOP;

import myProject.OOP.dishes.interfaces.IDish;
import myProject.OOP.timeTable.CallOfDay;
import myProject.OOP.timeTable.Delivery;

import java.util.List;


public class OOPmetod {
    //Field

    //Constructor

    //Function
    public void start(){
        CallOfDay.requestDay();
        Delivery delivery = new Delivery();
        List<IDish> dishList = delivery.getIngestion();
        delivery.readDishesList(dishList);
    }

}
