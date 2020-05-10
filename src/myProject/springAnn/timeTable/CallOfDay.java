package myProject.springAnn.timeTable;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class CallOfDay {
    //Field
    private static int enterDay;
    private static int enterIngestion;

    //Constructor

    //Function
    public DayOfWeek callDay (){
        DayOfWeek date = LocalDate.now().getDayOfWeek();
        return date;
    }

    public static void requestDay (){
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Enter day of week: \n1. Monday;\n2. Tuesday;\n3. Wednesday;\n4. Thursday;\n5. Friday;\n6. Sunday;\n7. Saturday;");
        //enterDay = scanner.nextInt();
        System.out.println("Enter ingestion: \n1. Breakfast;\n2. Dinner;\n3. Supper;");
        enterIngestion = scanner.nextInt();

    }

    public static int getEnterDay() {
        return enterDay;
    }

    public static int getEnterIngestion() {
        return enterIngestion;
    }
}
