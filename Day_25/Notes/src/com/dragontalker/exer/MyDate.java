package com.dragontalker.exer;

public class MyDate implements Comparable<MyDate>{
    private int year;
    private int month;
    private int day;

    public MyDate() {}

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

    @Override
    public int compareTo(MyDate d) {
            //比较年
            int yearDiff = this.getYear() - d.getYear();

            if (yearDiff != 0) {
                return yearDiff;
            }

            //比较月
            int monthDiff = this.getMonth() - d.getMonth();

            if (monthDiff != 0) {
                return monthDiff;
            }

            //比较日
            return this.getDay() - d
                    .getDay();
    }
}
