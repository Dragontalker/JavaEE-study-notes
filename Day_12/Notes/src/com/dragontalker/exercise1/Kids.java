package com.dragontalker.exercise1;

public class Kids extends ManKind{
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
        System.out.println("I am " + yearsOld + " years old.");
    }

    public void employed() {
        System.out.println("Kids should study and no job");
    }
}
