package org.fade.demo.jvm.basic.classload.initialize;

/**
 * clinit里的顺序
 * @author fade
 */
public class OrderExample {

    static {
        i = 10;
//        System.out.println(i);
    }

    private static int i = 1;

    public static void main(String[] args) {
        // 输出结果应该是1
        // 准备阶段i被赋值为0
        // 类初始化阶段，先被赋值为10，然后赋值为1
        System.out.println(i);
    }

}
