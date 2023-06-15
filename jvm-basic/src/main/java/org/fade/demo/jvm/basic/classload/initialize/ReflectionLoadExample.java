package org.fade.demo.jvm.basic.classload.initialize;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * 反射调用触发类初始化示例
 * @author fade
 */
public class ReflectionLoadExample {

    public static void main(String[] args) throws NoSuchFieldException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        Unsafe unsafe = reflectGetUnsafe();
        assert unsafe != null;
        // 1. Class.forName
//        Class.forName("org.fade.demo.jvm.basic.classload.initialize.ReflectionLoadExample$User");
        // 2. newInstance
        Class<?> clz = Class.forName("org.fade.demo.jvm.basic.classload.initialize.ReflectionLoadExample$User", false, ReflectionLoadExample.class.getClassLoader());
        clz.newInstance();
        System.out.println(unsafe.shouldBeInitialized(User.class));
        Field sexField = User.class.getDeclaredField("name");
        long fieldOffset = unsafe.staticFieldOffset(sexField);
        Object fieldBase = unsafe.staticFieldBase(sexField);
        Object object = unsafe.getObject(fieldBase, fieldOffset);
        System.out.println(object);
    }

    public static class User {

        public static String name="Hydra";

        int age;

    }

    private static Unsafe reflectGetUnsafe() {
        try {
            Field field = Unsafe.class.getDeclaredField("theUnsafe");
            field.setAccessible(true);
            return (Unsafe) field.get(null);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
