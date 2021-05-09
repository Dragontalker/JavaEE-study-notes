package com.dragontalker.exercise;

public class Kids {
    private int yearsOld;

    public Kids() {}

    public Kids(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    public int getYearsOld() {
        return this.yearsOld;
    }

    public void printAge() {
        System.out.println("I am " + yearsOld + "years old.");
    }
}
