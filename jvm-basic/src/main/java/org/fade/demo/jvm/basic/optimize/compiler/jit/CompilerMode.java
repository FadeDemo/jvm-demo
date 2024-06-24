package org.fade.demo.jvm.basic.optimize.compiler.jit;

/**
 * 体现不同编译模式的区别
 * @author fade
 * */
public class CompilerMode {

    public static void main(String[] args) {
        // 1. use -Xmixed
        // 2. use -Xint
        // 3. use -Xcomp
        long start = System.currentTimeMillis();
        calc(1000000);
        long end = System.currentTimeMillis();
        System.out.println("Time cost: " + (end - start) + " mill(s)");
    }

    public static void calc(int times) {
        for (int i = 0; i < times; ++i) {
            int sum = 0;
            for (int j = 0; j < 100; ++j) {
                sum += j;
            }
        }
    }

}
