package Structural.Adapter;

import java.util.Calendar;

public interface NewDateInterface {
    Calendar calendar = Calendar.getInstance();

    void setDay(int day);
    void setMonth(int month);
    void setYear(int year);
    int getDay();
    int getMonth();
    int getYear();
    void advanceDays(int days);
}
