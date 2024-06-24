package org.fade.demo.jvm.basic.str;

public class Joint {

    public static void main(String[] args) {
        test1();
        test2();
    }

    static void test1() {
        String a = "a";
        final String b = "b";
        String c = "ab";
        String d = a + b;
        System.out.println(c == d);
    }

    static void test2() {
        final String a = "a";
        final String b = "b";
        String c = "ab";
        String d = a + b;
        System.out.println(c == d);
    }

}
