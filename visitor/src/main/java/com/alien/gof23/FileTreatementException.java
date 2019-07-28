package com.alien.gof23;

/**
 * 表示向文件中添加 add 方法时抛出异常
 *
 * @author alien
 * @since 2019-07-28 14:20
 */
public class FileTreatementException extends RuntimeException {
    public FileTreatementException() {}

    public FileTreatementException(String msg) {
        super(msg);
    }
}
