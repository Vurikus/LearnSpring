package myProject.springXML.ingestion;

import myProject.springXML.dishes.interfaces.IDish;

import java.util.List;

public abstract class Ingestion {
    //public String getNamesDishes();
    public abstract List <IDish> getDishes();
}
