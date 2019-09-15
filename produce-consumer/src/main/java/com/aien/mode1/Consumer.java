package com.aien.mode1;

/**
 * program: gof23
 * description: 消费者
 *
 * @author: alien
 * @since: 2019/09/15 18:52
 */
public class Consumer {
    private final ItemQueue queue;

    private final String name;

    public Consumer(String name, ItemQueue queue) {
        this.queue = queue;
        this.name = name;
    }

    public void consume() throws InterruptedException {
        Item item = queue.take();
        System.out.println("消费者(" + name + ")处理生产者(" + item.getProducer() +")物品(" + item.getId() + ")");
    }
}
