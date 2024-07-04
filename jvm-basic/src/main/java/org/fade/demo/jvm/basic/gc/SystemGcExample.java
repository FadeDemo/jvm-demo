package org.fade.demo.jvm.basic.gc;

/**
 * <p>配合-XX:+PrintGCDetails使用</p>
 * @author fade
 */
public class SystemGcExample {

    public static void main(String[] args) {
        SystemGcExample systemGcExample = new SystemGcExample();
//        systemGcExample.test1();
        systemGcExample.test2();
    }

    public void test1() {
        {
            byte[] b = new byte[10 * 1024 * 1024];
        }
        System.gc();
    }

    public void test2() {
        {
            byte[] b = new byte[10 * 1024 * 1024];
        }
        int value = 10;
        System.gc();
    }

}
