package org.fade.demo.jvm.basic.memory.direct;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * 直接内存溢出示例
 * @author fade
 * */
public class OomExample {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        // -XX:MaxDirectMemorySize=5m
        Field field = Unsafe.class.getDeclaredField("theUnsafe");
        field.setAccessible(true);
        Unsafe unsafe = (Unsafe) field.get(null);
        while (true) {
            unsafe.allocateMemory(1024 * 1024);
        }
    }

}
