package org.fade.demo.jvm.basic.ref;

import java.lang.ref.SoftReference;
import java.util.Date;

/**
 * <p>run with -Xms10m -Xmx10m -XX:+PrintGCDetails</p>
 * @author fade
 */
public class SoftReferenceExample {

    public static void main(String[] args) {
        SoftReference<Date> softReference = new SoftReference<>(new Date());
        // or
        // Date date = new Date();
        // SoftReference<Date> softReference = new SoftReference<>(date);
        // date = null;
        System.out.println(softReference.get());
        System.gc();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("After gc: ");
        System.out.println(softReference.get());
        try {
//            byte[] bytes = new byte[7 * 1024 * 1024];
            byte[] bytes = new byte[7168 * 1024 - 950 * 1024];
        } catch (OutOfMemoryError e) {
            e.printStackTrace();
        } finally {
            System.out.println(softReference.get());
        }
    }

}
