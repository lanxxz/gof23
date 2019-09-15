package com.aien.mode1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * program: gof23
 * description: 主入口
 *
 * @author: alien
 * @since: 2019/09/15 18:39
 */
public class Main {
    public static void main(String[] args) {
        ItemQueue queue = new ItemQueue();
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 2; i++) {
            final Producer producer = new Producer("Producer_" + i, queue);
            executorService.submit(() -> {
               while (true) {
                   producer.produce();
               }
            });
        }

        for (int i = 0; i < 3; i++) {
            final Consumer consumer = new Consumer("Consumer_" + i, queue);
            executorService.submit(() -> {
                while (true) {
                    consumer.consume();
                }
            });
        }

        executorService.shutdown();

        try {
            executorService.awaitTermination(10, TimeUnit.SECONDS);
            executorService.shutdownNow();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
