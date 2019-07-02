package com.alien.gof23.mode3;

import java.io.IOException;

/**
 * 文件操作类
 *
 * @author Alien
 * @since 2019/6/24 23:47
 */
public interface FileIO {
    /**
     * @author Alien
     * @description 读取文件
     * @date 23:48 2019/6/24
     * @param fileName 文件名
     **/
    void readFromFile(String fileName) throws IOException;

    /**
     * @author Alien
     * @description 保存文件
     * @date 23:49 2019/6/24
     * @param fileName 文件名
     **/
    void writeToFile(String fileName) throws IOException;

    /**
     * @author Alien
     * @description 设置键值对
     * @date 23:50 2019/6/24
     * @param key 键
     * @param value 值
     **/
     void setValue(String key, String value);

     /**
      * @author Alien
      * @description 根据 key 获取 value 值
      * @date 23:52 2019/6/24
      * @param key 键
      * @return java.lang.String
      **/
     String getValue(String key);
}
