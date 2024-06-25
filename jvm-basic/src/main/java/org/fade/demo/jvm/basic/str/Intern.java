package org.fade.demo.jvm.basic.str;

/**
 * @author fade
 */
public class Intern {

    public static void main(String[] args) {
        String s3 = new String("1") + new String("1");
        s3.intern(); // true
        String s4 = "11";
//        s3.intern(); // false
        System.out.println(s3 == s4);
    }

}
