package com.dragontalker.exer1;

public class EcmDef {
    public static void main(String[] args) {

    }

    public int divide(int i, int j) throws EcDef{
        if (i < 0 || j < 0) {
            throw new EcDef("分子或分母为负数啦!");
        }
        return 1;
    }
}
