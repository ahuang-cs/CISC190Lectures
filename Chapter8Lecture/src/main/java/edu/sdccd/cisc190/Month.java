package edu.sdccd.cisc190;

public class Month {
    private int monthNumber;
    public Month() {
        monthNumber = 1;
    }

    enum MonthNames {
        JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER,OCTOBER,NOVEMBER,DECEMBER;
    }

    public Month(int monthNumber) {
        setMonthNumber(monthNumber);
    }

    public Month(String monthName) {
        monthNumber = Month.MonthNames.valueOf(monthName).ordinal()+1;
    }

    public void setMonthNumber(int monthNumber) {
        if(monthNumber < 1 || monthNumber > 12) {
            monthNumber = 1;
        } else {
            this.monthNumber = monthNumber;
        }
    }
    public int getMonthNumber() {
        return monthNumber;
    }

    public String getMonthName() {
        return MonthNames.values()[monthNumber-1].toString();
    }

    public String toString() {
        return getMonthName();
    }

    public boolean equals(Month month) {
        return monthNumber == month.getMonthNumber();
    }
    public boolean greaterThan(Month month) {
        return monthNumber > month.getMonthNumber();
    }
    public boolean lessThan(Month month) {
        return monthNumber < month.getMonthNumber();
    }
}
