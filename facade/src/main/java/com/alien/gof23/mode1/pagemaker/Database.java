package com.alien.gof23.mode1.pagemaker;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;

/**
 * 模拟数据库内容
 *
 * @author alien
 * @since 2019-08-03 16:22
 */
public class Database {
    private Database(){}

    public static Properties getProperties(String dbName) {
        String fileName = dbName + ".txt";
        URL url = Database.class.getClassLoader().getResource(fileName);
        Properties properties = new Properties();
        try (InputStream inputStream = new FileInputStream(new File(url.getFile()))) {
            properties.load(inputStream);
        } catch (IOException e) {
            System.err.println("Warning: " + fileName + " is not fount.");
        }
        return properties;
    }
}
