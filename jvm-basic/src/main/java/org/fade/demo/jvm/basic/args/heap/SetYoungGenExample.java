package org.fade.demo.jvm.basic.args.heap;

/**
 * 设置新生代大小示例
 * @author fade
 */
public class SetYoungGenExample {

    public static void main(String[] args) {
        // 需配置jvm参数
        // -XX:+PrintGCDetails
        // 1. -XX:NewSize -XX:MaxNewSize
        // 2. -Xmn<young size>[unit]
        System.out.println("Young Gen Size...");
    }

}
