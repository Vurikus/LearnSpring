package myProject.OOP;

import myProject.OOP.timeTable.CallOfDay;
import myProject.OOP.timeTable.Delivery;


public class OOPmetod {
    //Field

    //Constructor

    //Function
    public void start(){
        CallOfDay.requestDay();
        Delivery delivery = new Delivery();
        String namesDishes = delivery.getIngestion().getNamesDishes();
        System.out.println(namesDishes);
    }

}
