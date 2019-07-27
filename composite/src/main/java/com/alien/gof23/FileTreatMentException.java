package com.alien.gof23;

/**
 * 对文件添加 add 方法时抛出的异常
 *
 * @author alien
 * @since 2019-07-27 21:03
 */
public class FileTreatMentException extends RuntimeException {
    public FileTreatMentException() {}

    public FileTreatMentException(String msg) {
        super(msg);
    }
}
