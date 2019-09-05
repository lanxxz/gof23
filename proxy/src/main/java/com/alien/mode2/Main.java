package com.alien.mode2;

/**
 * program: gof23
 * description: 主入口 <br/>
 * 代理类不知道真实类存在的写法
 *
 * @author: alien
 * @since: 2019/09/04 22:47
 */
public class Main {
    public static void main(String[] args) {
        Printable p = new PrinterProxy("Alice", "com.alien.mode2.Printer");
        System.out.println("现在名字是:" + p.getPrinterName());
        p.setPrinterName("Bob");
        System.out.println("现在名字是:" + p.getPrinterName());
        p.print("Hello, WOrld!");
    }
}
