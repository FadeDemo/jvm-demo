package org.fade.demo.jvm.basic.args.heap;

/**
 * 设置Eden区和Survivor区比例示例
 * @author fade
 */
public class SetSurvivorRatioExample {

    public static void main(String[] args) {
        // -XX:+PrintGCDetails -XX:SurvivorRatio=1 -Xmn200m
        System.out.println("Eden:Survivor=1:1...");
    }

}
