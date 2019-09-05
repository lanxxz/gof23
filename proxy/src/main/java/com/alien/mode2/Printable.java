package com.alien.mode2;

/**
 * program: gof23
 * description: 接口
 *
 * @author: alien
 * @since: 2019/09/04 22:51
 */
public interface Printable {
    /**
     * method name: setPrinterName <br/>
     * description: 设置名字
     * @param name:
     * @return: void
     * @since: 2019-09-04
     */
    void setPrinterName(String name);

    /**
     * method name: getPrinterName <br/>
     * description: 获取名字

     * @return: java.lang.String
     * @since: 2019-09-04
     */
    String getPrinterName();

    /**
     * method name: print <br/>
     * description: 显示文字(打印输出)
     * @param string:
     * @return: void
     * @since: 2019-09-04
     */
    void print(String string);
}
