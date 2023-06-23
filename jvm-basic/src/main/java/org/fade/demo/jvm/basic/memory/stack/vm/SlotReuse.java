package org.fade.demo.jvm.basic.memory.stack.vm;

/**
 * slot复用
 * @author fade
 */
public class SlotReuse {

    public static void main(String[] args) {
        int a = 0;
        {
            int b = 0;
            b = a + 1;
        }
        int c = a + 1;
    }

}
