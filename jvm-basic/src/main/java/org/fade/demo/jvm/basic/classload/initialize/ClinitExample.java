package org.fade.demo.jvm.basic.classload.initialize;

/**
 * clinit 方法示例
 * @author fade
 */
public class ClinitExample {

    // 没赋值仍然不会有
//    private static int i;

    // 空的静态代码块也会有clinit方法
//    static {
//
//    }

    public static void main(String[] args) {
        // clinit方法来源于静态变量和静态代码块
        System.out.println("此时没有clinit方法");
    }

}
