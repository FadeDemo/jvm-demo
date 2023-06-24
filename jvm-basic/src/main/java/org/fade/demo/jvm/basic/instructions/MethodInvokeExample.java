package org.fade.demo.jvm.basic.instructions;

/**
 * 方法调用指令演示
 * @author fade
 */
public class MethodInvokeExample {

    public static class Father {

        public final void finalMethod() {

        }

    }

    public static class Son extends Father {

        private void privateMethod() {

        }

        public static void staticMethod() {

        }

        public void virtualMethod() {

        }

        public void test() {
            super.finalMethod();
            finalMethod();
            privateMethod();
            new Son();
            staticMethod();
            virtualMethod();
            Interface i = () -> System.out.println("hello");
            i.interfaceMethod();
        }

    }

    /**
     * 接口
     * */
    interface Interface {

        /**
         * 接口方法
         * */
        void interfaceMethod();

    }

}
