package org.fade.demo.jvm.basic.memory.heap;

/**
 * 为什么最大堆容量与-Xmx设置的并不一样示例
 * @author fade
 */
public class WhyMaxHeapSizeNotEqualsToXmx {

    public static void main(String[] args) {
        // -Xmx512m -Xms512m
        long l = Runtime.getRuntime().maxMemory();
        long mb = l / 1024 / 1024;
        System.out.println(mb + "MB");
        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
