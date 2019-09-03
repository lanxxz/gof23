package com.alien.mode1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * program: gof23
 * description: 表示"大型字符"的类
 *
 * @author: alien
 * @since: 2019/09/03 22:09
 */
public class BigChar {
    /**
     * description: 字符名称
     * @since: 2019-09-03
     */
    private char charName;
    /**
     * description: 大型字符对应的字符串 (由 # . \n 组成)
     * @since: 2019-09-03
     */
    private String fontData;

    public BigChar(char charName) {
        this.charName = charName;
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                    ClassLoader.getSystemResourceAsStream("big" + charName + ".txt")
                )
//                new FileReader("big" + charName + ".txt")
        )) {
            String line;
            StringBuilder buf = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                buf.append(line).append("\n");
            }
            this.fontData = buf.toString();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            this.fontData = charName + "?";
        }
    }

    public void print() {
        System.out.println(fontData);
    }



}
