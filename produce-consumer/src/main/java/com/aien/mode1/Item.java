package com.aien.mode1;

/**
 * program: gof23
 * description: data类
 *
 * @author: alien
 * @since: 2019/09/15 18:41
 */
public class Item {
    private int id;
    private String producer;

    public Item(int id, String producer) {
        this.id = id;
        this.producer = producer;
    }

    public int getId() {
        return id;
    }

    public String getProducer() {
        return producer;
    }
}
