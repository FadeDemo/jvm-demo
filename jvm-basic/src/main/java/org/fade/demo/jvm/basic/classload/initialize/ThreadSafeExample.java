package org.fade.demo.jvm.basic.classload.initialize;

import com.google.common.util.concurrent.ThreadFactoryBuilder;

import java.util.concurrent.*;

/**
 * 线程安全示例
 * @author fade
 */
public class ThreadSafeExample {

    public static void main(String[] args) {
        ThreadFactory factory = new ThreadFactoryBuilder()
                .setDaemon(false)
                .setPriority(Thread.NORM_PRIORITY)
                .setNameFormat("ThreadSafe-%d").build();
        ExecutorService pool = new ThreadPoolExecutor(2, 2,
                0, TimeUnit.MILLISECONDS,
                new LinkedBlockingDeque<>(5), factory);
        // 用CountDownLatch控制并行
        CountDownLatch countDownLatch = new CountDownLatch(1);
        for (int i = 0; i < 2; ++i) {
            pool.execute(() -> {
                try {
                    countDownLatch.await();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                // new会触发类初始化
                Test test = new Test();
            });
        }
        countDownLatch.countDown();
        pool.shutdown();
    }

    private static class Test {

        static {
            System.out.println("Class initialization is thread-safe...");
        }

    }

}
