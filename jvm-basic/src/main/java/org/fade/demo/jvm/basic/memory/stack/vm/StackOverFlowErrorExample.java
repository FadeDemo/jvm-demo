package org.fade.demo.jvm.basic.memory.stack.vm;

/**
 * 栈溢出示例
 * @author fade
 */
public class StackOverFlowErrorExample {

    public static void main(String[] args) {
        recursive();
    }

    public static void recursive() {
        recursive();
    }

}
