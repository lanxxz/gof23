package com.aien.mode1;


import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * program: gof23
 * description: 队列
 *
 * @author: alien
 * @since: 2019/09/15 18:43
 */
public class ItemQueue {

    private BlockingQueue<Item> queue;

    public ItemQueue() {
        queue = new LinkedBlockingQueue<>(5);
    }

    public void put(Item item) throws InterruptedException {
        queue.put(item);
    }

    public Item take() throws InterruptedException {
        return queue.take();
    }
}
