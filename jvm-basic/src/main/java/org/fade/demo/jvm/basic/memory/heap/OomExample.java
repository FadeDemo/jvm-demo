package org.fade.demo.jvm.basic.memory.heap;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * OOM示例
 * @author fade
 * */
public class OomExample {

    public static void main(String[] args) {
        List<byte[]> list = new ArrayList<>();
        while (true) {
            list.add(new byte[new Random()
                    .nextInt(1024 * 1024)]);
        }
    }

}
