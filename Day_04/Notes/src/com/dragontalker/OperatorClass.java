package com.dragontalker;

public class OperatorClass {

    public static void main(String[] args) {
        boolean x = true;
        boolean y = false;
        short z = 40;
        if ((z++ == 40) && (y = true)) {
            System.out.println("1. z is now " + z);
            z++;
            System.out.println("2. z is now " + z);
        }
        if ((x = false) || (++z == 43)) {
            System.out.println("3. z is now " + z);
            z++;
            System.out.println("4. z is now " + z);
        }
        System.out.println("z = " + z);
    }
}
