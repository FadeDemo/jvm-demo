package org.fade.demo.jvm.basic.gc;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 * @author fade
 */
public class GcRootExample {

    public static void main(String[] args) {
        List<Object> list = new ArrayList<Object>();
        Date birthday = new Date();
        for (int i = 0; i < 100; ++i) {
            list.add(String.valueOf(i));
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Please create dump file");
        new Scanner(System.in).next();
        list = null;
        birthday = null;
        System.out.println("Please create dump file again");
        new Scanner(System.in).next();
        System.out.println("over");
    }

}
