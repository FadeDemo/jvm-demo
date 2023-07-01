package org.fade.demo.jvm.basic.args;

/**
 * -XX:+PrintGC示例
 * @author fade
 * */
public class PrintGCExample {

    public static void main(String[] args) {
        // -XX:+PrintGC
        // -Xms30m -Xmx30m -XX:SurvivorRatio=8
        byte[] array = new byte[5 * 1024 * 1024];
        byte[] array1 = new byte[2 * 1024 * 1024];
    }

}
