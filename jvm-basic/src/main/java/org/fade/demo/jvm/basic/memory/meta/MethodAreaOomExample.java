package org.fade.demo.jvm.basic.memory.meta;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;

/**
 * @author fade
 */
public class MethodAreaOomExample {

    public static void main(String[] args) {
        // -XX:MetaspaceSize=10m -XX:MaxMetaspaceSize=10m
        // FIXME: 很奇怪嗷，演示不出来，GC回收明显大于加载速度
        while (true) {
            Enhancer enhancer = new Enhancer();
            enhancer.setSuperclass(OomObject.class);
            enhancer.setCallback((MethodInterceptor) (obj, method, args1, proxy) -> {
                System.out.println("cglib代理开始");
                Object o = proxy.invokeSuper(obj, args1);
                System.out.println("cglib代理结束");
                return o;
            });
            enhancer.create();
//            ((MethodAreaOomExample) enhancer.create()).doNothing();
        }
    }

    public void doNothing() {
        System.out.println("do nothing...");
    }

    static class OomObject {

    }

}
