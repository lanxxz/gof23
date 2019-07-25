package com.alien.gof23.mode3;

/**
 * 排序打印类
 *
 * @author alien
 * @since 2019-07-26 00:21
 */
public class SortAndPoint {
    private Comparable[] data;
    private Sorter sorter;

    public SortAndPoint(Comparable[] data, Sorter sorter) {
        this.data = data;
        this.sorter = sorter;
    }

    public void execute() {
        print();
        sorter.sort(data);
        print();
    }

    public void print() {
        for(int i = 0; i < data.length; i++) {
            System.out.print(data[i] + ", ");
        }
        System.out.println();
    }

}
