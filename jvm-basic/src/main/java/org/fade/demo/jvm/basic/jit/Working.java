package org.fade.demo.jvm.basic.jit;

import java.util.ArrayList;
import java.util.List;

/**
 * JIT编译器正在工作的示例
 * @author fade
 * */
public class Working {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(8);
        while (true) {
            list.add("test");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
