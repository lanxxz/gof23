package com.alien.gof23.mode3;

/**
 * 主入口
 *
 * @author alien
 * @since 2019-07-26 00:25
 */
public class Main {

    public static void main(String[] args) {
        String[] data1 = {
                "Dumpty", "Bowman", "Carroll", "Elfland", "Alice"
        };
        SortAndPoint sap1 = new SortAndPoint(data1, new SelectionSorter());
        sap1.execute();

        System.out.println();

        String[] data2 = {
                "Dumpty", "Bowman", "Carroll", "Elfland", "Alice"
        };
        SortAndPoint sap2 = new SortAndPoint(data2, new QuickSorter());
        sap2.execute();
    }
}
