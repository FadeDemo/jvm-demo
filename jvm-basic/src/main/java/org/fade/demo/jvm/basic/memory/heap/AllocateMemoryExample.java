package org.fade.demo.jvm.basic.memory.heap;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 内存分配例子
 * @author fade
 */
public class AllocateMemoryExample {

    private final byte[] buffer = new byte[new Random().nextInt(1024 * 200)];

    public static void main(String[] args) {
        // -Xms800m -Xmx800m
        List<AllocateMemoryExample> list = new ArrayList<>();
        while (true) {
            list.add(new AllocateMemoryExample());
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
