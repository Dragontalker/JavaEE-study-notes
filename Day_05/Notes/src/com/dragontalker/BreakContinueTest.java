package com.dragontalker;

/*
break和continue关键字的使用
break: switch-case和循环都可以使用， 结束当前循环.
continue: 只能在循环结构中使用， 结束当次循环.

相同点: 关键字后面不能声明执行语句.
 */

public class BreakContinueTest {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 4 == 0) {
                //break; // output: 123
                continue; // output: 123567910
            }
            System.out.print(i);
        }
        System.out.println();

        //****
        label: for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 10; j++) {
                if (j % 4 == 0) {
                    //break; // 默认跳出包裹此关键字最近的一层循环
                    //continue;
                    //break label;
                    continue label;
                }

                System.out.print(j);
            }

            System.out.println();
        }
    }
}
