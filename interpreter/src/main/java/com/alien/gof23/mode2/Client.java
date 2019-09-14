package com.alien.gof23.mode2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * program: gof23
 * description: 主入口
 *
 * @author: alien
 * @since: 2019/09/14 19:35
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("请输入表达式:");
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String expStr = br.readLine();
            Map<String, Integer> var = getValue(expStr);
            Calculator cal = new Calculator(expStr);
            System.out.println("运算结果为：" + expStr + "=" + cal.run(var));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static Map<String, Integer> getValue(String expStr) throws IOException {
        Map<String, Integer> map = new HashMap<>();
        // 解析有几个参数要传递
        for (char ch: expStr.toCharArray()) {
            if (ch != '+' && ch != '-') {
                // 解决重复参数的问题
                if (!map.containsKey(String.valueOf(ch))) {
                    System.out.println("请输入参数:");
                    String in = new BufferedReader(new InputStreamReader(System.in)).readLine();
                    map.put(String.valueOf(ch), Integer.valueOf(in));
                }
            }
        }
        return map;
    }



}
