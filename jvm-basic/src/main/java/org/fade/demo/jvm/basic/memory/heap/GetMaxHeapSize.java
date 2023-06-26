package org.fade.demo.jvm.basic.memory.heap;

/**
 * 获取堆的最大容量
 * @author fade
 * */
public class GetMaxHeapSize {

    public static void main(String[] args) {
        long maxHeapSize = Runtime.getRuntime().maxMemory();
        long mb = maxHeapSize / 1024 / 1024;
        System.out.println(mb + "MB");
    }

}
