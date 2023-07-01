package org.fade.demo.jvm.basic.optimize.compiler.escape;

import java.util.Date;

/**
 * 逃逸分析例子
 * @author fade
 */
public class CloseEscapeAnalysisExample {

    public static void main(String[] args) {
        // common: -Xms50m -Xmx50m
        // 1. -XX:+PrintGCDetails
        // 2. -XX:+PrintGCDetails -XX:-DoEscapeAnalysis
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; ++i) {
            Date date = new Date();
        }
        long end = System.currentTimeMillis();
        System.out.println("Time cost: " + (end - start) + "ms");
    }

}
