package org.fade.demo.jvm.basic.args.heap;

/**
 * 设置新生代和年老代比例示例
 * @author fade
 */
public class SetNewRatioExample {

    public static void main(String[] args) {
        // 需配置jvm参数
        // -XX:+PrintGCDetails
        // -Xms512m -Xmx512m
        // -XX:NewRatio=1
        // 与 -Xmn200m 同时出现时，新生代应该是200MB
        System.out.println("Young Gen/Old Gen...");
    }

}
