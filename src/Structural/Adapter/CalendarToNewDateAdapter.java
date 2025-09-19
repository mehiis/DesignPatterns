package Structural.Adapter;

public class CalendarToNewDateAdapter implements NewDateInterface {
    public int day;
    public int month;
    public int year;

    @Override
    public void setDay(int day) {
        calendar.set(calendar.DAY_OF_MONTH, day);
    }

    @Override
    public void setMonth(int month) {
        calendar.set(calendar.MONTH, month);
    }

    @Override
    public void setYear(int year) {
        calendar.set(calendar.YEAR, year);
    }

    @Override
    public int getDay() {
        day = calendar.get(calendar.DAY_OF_MONTH);
        return day;
    }

    @Override
    public int getMonth() {
        month = calendar.get(calendar.MONTH);
        return month;
    }

    @Override
    public int getYear() {
        year = calendar.get(calendar.YEAR);
        return year;
    }

    @Override
    public void advanceDays(int days) {
        calendar.add(calendar.DAY_OF_MONTH, days);
    }
}
