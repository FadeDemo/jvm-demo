package org.fade.demo.jvm.basic.memory.heap;

/**
 * 对象直接进入老年代示例
 * @author fade
 */
public class ObjectDirectEnterOldGen {

    public static void main(String[] args) {
        // -XX:+PrintGCDetails -Xms30m -Xmx30m
//        allocate1();
//        allocate2();
//        allocate3();
        allocate4();
    }

    public static void allocate1() {
        // 10MB
        // 此时不需要GC 大对象直接进入了年老代
        byte[] array = new byte[10 * 1024 * 1024];
//        byte[] array = new byte[9 * 1024 * 1024];
//        byte[] array = new byte[8 * 1024 * 1024];
//        byte[] array = new byte[7 * 1024 * 1024];
    }

    public static void allocate2() {
        // 此时分配在了Eden区内
        byte[] array = new byte[6225 * 1024];
    }

    public static void allocate3() {
        // 此时6225KB分配在Eden区
        // 4MB直接进入年老代
        byte[] array, array1;
        array = new byte[6225 * 1024];
        array1 = new byte[4 * 1024 * 1024];
    }

    public static void allocate4() {
        // 此时6225KB分配在Eden区
        // 发生一次Minor GC
        // 再把6225KB分配至年老代，因为Survivor区放不下
        // 把3MB分配至Eden区
        // 部分原Eden区内容进入Survivor from区
        byte[] array, array1;
        array = new byte[6225 * 1024];
        array1 = new byte[3 * 1024 * 1024];
    }

}
