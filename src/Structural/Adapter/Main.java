package Structural.Adapter;

public class Main {
    public static void main(String[] args){
        CalendarToNewDateAdapter date = new CalendarToNewDateAdapter();

        System.out.println("Current Date: " + date.getDay() + "/" + date.getMonth() + "/" + date.getYear());

        date.setYear(1998);
        date.setMonth(8);
        date.setDay(25);
        System.out.println("Current Date: " + date.getDay() + "/" + date.getMonth() + "/" + date.getYear());

        date.advanceDays(1);
        System.out.println("Current Date: " + date.getDay() + "/" + date.getMonth() + "/" + date.getYear());

        date.advanceDays(-1);
        System.out.println("Current Date: " + date.getDay() + "/" + date.getMonth() + "/" + date.getYear());

        date.advanceDays(9886); //<-- I have lived this many days on 19.9.2025
        System.out.println("Current Date: " + date.getDay() + "/" + date.getMonth() + "/" + date.getYear());
    }
}
