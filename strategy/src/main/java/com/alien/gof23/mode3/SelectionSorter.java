package com.alien.gof23.mode3;

/**
 * 选择排序
 *
 * @author alien
 * @since 2019-07-26 00:16
 */
public class SelectionSorter implements Sorter {
    @Override
    public void sort(Comparable[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < data.length; j++) {
                if (data[min].compareTo(data[j]) > 0) {
                    min = j;
                }
            }
            Comparable passingPlace = data[min];
            data[min] = data[i];
            data[i] = passingPlace;
        }
    }
}
