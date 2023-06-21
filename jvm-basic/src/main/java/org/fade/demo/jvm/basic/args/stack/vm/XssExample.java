package org.fade.demo.jvm.basic.args.stack.vm;

/**
 * -Xss参数示例
 * @author fade
 */
public class XssExample {

    private static int count = 1;

    public static void main(String[] args) {
        // default value is 9746 (depends on os, not fixed)
        // after setting -Xss256k, result is 2149
        System.out.println(count++);
        main(args);
    }

}
