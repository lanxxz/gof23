package com.alien.mode1;

/**
 * program: gof23
 * description: 主入口
 *
 * @author: alien
 * @since: 2019/09/04 22:47
 */
public class Main {
    public static void main(String[] args) {
        Printable p = new PrinterProxy("Alice");
        System.out.println("现在名字是:" + p.getPrinterName());
        p.setPrinterName("Bob");
        System.out.println("现在名字是:" + p.getPrinterName());
        p.print("Hello, WOrld!");
    }
}
