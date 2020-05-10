package myProject.springAnn.ingestion;

import myProject.springAnn.dishes.interfaces.IDish;

import java.util.List;

public abstract class Ingestion {
    //public String getNamesDishes();
    public abstract List <IDish> getDishes();
}
