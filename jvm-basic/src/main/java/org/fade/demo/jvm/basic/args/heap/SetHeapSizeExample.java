package org.fade.demo.jvm.basic.args.heap;

/**
 * 设置堆大小示例
 * @author fade
 */
public class SetHeapSizeExample {

    public static void main(String[] args) {
        // 需配置jvm参数
        // -XX:+PrintGCDetails
        // -Xms512m -Xmx512m 注意可能会受IDEA堆大小的限制
        System.out.println("Heap Size...");
    }

}
