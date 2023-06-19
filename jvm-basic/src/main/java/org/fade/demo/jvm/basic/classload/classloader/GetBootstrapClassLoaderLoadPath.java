package org.fade.demo.jvm.basic.classload.classloader;

import sun.misc.Launcher;

import java.net.URL;

/**
 * 获取BootstrapClassLoader的加载路径
 * @author fade
 */
public class GetBootstrapClassLoaderLoadPath {

    public static void main(String[] args) {
        URL[] urLs = Launcher.getBootstrapClassPath().getURLs();
        for (URL url: urLs) {
            System.out.println(url.getPath());
        }
    }

}
