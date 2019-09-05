package com.alien.mode1;

/**
 * program: gof23
 * description: 表示带有名字的打印机的类(代理人)
 *
 * @author: alien
 * @since: 2019/09/04 23:00
 */
public class PrinterProxy implements Printable {
    private String name;
    private Printer real;

    public PrinterProxy() {}

    public PrinterProxy(String name) {
        this.name = name;
    }

    private synchronized void realize() {
        if (real == null) {
            real = new Printer(name);
        }
    }

    @Override
    public synchronized void setPrinterName(String name) {
        if (real != null) {
            real.setPrinterName(name);
        }
        this.name = name;
    }

    @Override
    public String getPrinterName() {
        return name;
    }

    @Override
    public void print(String string) {
        realize();
        real.print(string);
    }
}
