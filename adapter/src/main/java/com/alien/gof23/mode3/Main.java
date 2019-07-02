package com.alien.gof23.mode3;

import java.io.IOException;

/**
 * 主入口<br/>
 * 读取文件 file.txt, 设置属性值, 保存至 newfile.txt<br/>
 *
 *
 * @author Alien
 * @since 2019/6/24 23:52
 */
public class Main {
    public static void main(String[] args) {
//        System.out.println(System.getProperty("user.dir"));
        String file = Main.class.getClass().getResource("/file.txt").getFile();
        FileIO fileIO = new FileProperites();
        try {
            fileIO.readFromFile(file);
            fileIO.setValue("year", "2019");
            fileIO.setValue("month", "06");
            fileIO.setValue("day", "25");
            fileIO.writeToFile("newfile.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
