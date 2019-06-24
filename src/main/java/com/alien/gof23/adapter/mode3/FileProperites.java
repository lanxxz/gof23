package com.alien.gof23.adapter.mode3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * 适配器
 *
 * @author Alien
 * @since 2019/6/24 23:53
 */
public class FileProperites implements FileIO {

    private Properties properties = new Properties();

    public FileProperites() {}

    @Override
    public void readFromFile(String fileName) throws IOException {
        properties.load(new FileInputStream(fileName));
    }

    @Override
    public void writeToFile(String fileName) throws IOException {
        properties.store(new FileOutputStream(fileName), "written by FileProperties");
    }

    @Override
    public void setValue(String key, String value) {
        properties.setProperty(key, value);
    }

    @Override
    public String getValue(String key) {
        return properties.getProperty(key, "");
    }
}
