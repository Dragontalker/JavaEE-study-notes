package com.dragontalker.exer2;

public class MyDate {
    private final int year;
    private final int month;
    private final int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public String toDateString() {
        return year + "年" + month + "月" + day + "日";
    }
}
