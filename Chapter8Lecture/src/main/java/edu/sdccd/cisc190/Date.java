package edu.sdccd.cisc190;

import java.time.YearMonth;

public final class Date {
    private final Month month;
    private final int day;
    private final int year;

    public Date(int month, int day, int year) {
        this.month = new Month(month);
        YearMonth yearMonth = YearMonth.of(year, month);
        if(day > 0 && day <= yearMonth.lengthOfMonth()) {
            this.day = day;
        } else {
            this.day = 1;
        }
        if(year == 0) this.year = 1;
        else this.year = year;
    }

    public String toString() {
        return String.format("%s %d, %d", month.getMonthName(), day, year);
    }
}
