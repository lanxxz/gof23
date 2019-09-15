package com.aien.mode1;

import java.util.Random;

/**
 * program: gof23
 * description: 生产者
 *
 * @author: alien
 * @since: 2019/09/15 18:47
 */
public class Producer {
    private final ItemQueue queue;

    private final String name;

    private int itemId;

    public Producer(String name, ItemQueue queue) {
        this.queue = queue;
        this.name = name;
    }

    public void produce() throws InterruptedException {
        Item item = new Item(itemId++, name);
        queue.put(item);
        Random random = new Random();
        Thread.sleep(random.nextInt(2000));
    }
}
