package com.alien.gof23.mode3;

/**
 * 快速排序
 *
 * @author alien
 * @since 2019-07-26 00:29
 */
public class QuickSorter implements Sorter {
    private Comparable[] data;

    @Override
    public void sort(Comparable[] data) {
        this.data = data;
        qsort(0, data.length - 1);
    }

    private void qsort(int pre, int port) {
        int savedPre = pre;
        int savedPort = port;
        Comparable mid = data[(pre + port) / 2];
        do {
            while (data[pre].compareTo(mid) < 0) {
                pre++;
            }
            while (mid.compareTo(data[port]) < 0) {
                port--;
            }

            if (pre <= port) {
                Comparable tmp = data[pre];
                data[pre] = data[port];
                data[port] = tmp;
                pre++;
                port--;
            }

        } while (pre < port);

        if (savedPre < port) {
            qsort(savedPre, port);
        }

        if (pre < savedPort) {
            qsort(pre, savedPort);
        }
    }

    public void print() {
        for(int i = 0; i < data.length; i++) {
            System.out.print(data[i] + ", ");
        }
        System.out.println();
    }
}
