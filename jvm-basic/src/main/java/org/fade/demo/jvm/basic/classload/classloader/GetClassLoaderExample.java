package org.fade.demo.jvm.basic.classload.classloader;

/**
 * 获取类加载器示例
 * @author fade
 */
public class GetClassLoaderExample {

    public static void main(String[] args) {
        // ExtClassLoader的parent为null，实际为BootstrapClassLoader
        ClassLoader classLoader = GetClassLoaderExample.class.getClassLoader();
        StringBuilder split = new StringBuilder("|--");
        boolean needContinue = true;
        while (needContinue){
            System.out.println(split.toString() + classLoader);
            if(classLoader == null){
                needContinue = false;
            }else{
                classLoader = classLoader.getParent();
                split.insert(0, "\t");
            }
        }
    }

}
