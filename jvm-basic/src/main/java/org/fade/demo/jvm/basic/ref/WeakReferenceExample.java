package org.fade.demo.jvm.basic.ref;

import java.lang.ref.WeakReference;
import java.util.Date;

/**
 * @author fade
 */
public class WeakReferenceExample {

    public static void main(String[] args) {
        WeakReference<Date> weakReference = new WeakReference<>(new Date());
        System.out.println(weakReference.get());
        System.gc();
        System.out.println("After gc: ");
        System.out.println(weakReference.get());
    }

}
