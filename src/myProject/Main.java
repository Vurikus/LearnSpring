package myProject;

import myProject.OOP.OOPmetod;
import myProject.springXML.SpringXML;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Main {
    //Field

    //Constructor

    //Function
    public static void main(String[] args) {
        //OOPmetod();

        springXMLmetod();
        //springAnnMetod();
    }

    private static void OOPmetod(){
        OOPmetod ooPmetod = new OOPmetod();
        ooPmetod.start();
    }

    private static  void springXMLmetod (){
        SpringXML springXML = new SpringXML();
        springXML.start();

    }

    private static void springAnnMetod (){

    }
}
