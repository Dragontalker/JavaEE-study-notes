package com.dragontalker;

/*
算法的考查, 求数值型数组中元素的最大值, 最小值, 平均数, 总和等.

定义一个int型的一维数组, 包含10个元素, 分别赋一些随机整数,
然后求出所有元素的最大值, 最小值, 和值, 平均值, 并输出出来.
要求: 所有随机数都是两位数.

[10, 99]
公式: (int)(Math.random() * (99 - 10 + 1) + 10)
 */

public class ArrayTest2 {

    public  static void main(String[] args) {
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * (99 - 10 + 1) + 10);
        }

        // 求数组元素的最大值
        int maxValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (maxValue < arr[i]) {
                maxValue = arr[i];
            }
        }

        // 求数组元素的最小值
        int minValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (minValue > arr[i]) {
                minValue = arr[i];
            }
        }

        // 求数组元素的总和
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        // 求数组元素的平均数
        double avg = sum / arr.length;

        System.out.println("最大值为: " + maxValue);
        System.out.println("最小值为: " + minValue);
        System.out.println("总和为: " + sum);
        System.out.println("平均数为: " + avg);

    }
}
