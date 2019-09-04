package com.alien.mode1;

/**
 * program: gof23
 * description: 表示带名字的打印机的类(本人)
 *
 * @author: alien
 * @since: 2019/09/04 22:49
 */
public class Printer implements Printable {
    private String name;
    public Printer() {
        heavyJob("Printer 实例生成中...");
    }

    public Printer(String name) {
        this.name = name;
        heavyJob("Printer实例生成中(" + name + ")...");
    }

    private void heavyJob(String msg) {
        System.out.print(msg);
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(".");
        }
        System.out.println("结束");
    }

    @Override
    public void setPrinterName(String name) {
        this.name = name;
    }

    @Override
    public String getPrinterName() {
        return name;
    }

    @Override
    public void print(String string) {
        System.out.println("===" + name + "===");
        System.out.println(string);
    }
}
