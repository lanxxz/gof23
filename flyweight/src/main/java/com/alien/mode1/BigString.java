package com.alien.mode1;

/**
 * program: gof23
 * description: 表示多个 {@link BigChar} 组成的"大型字符串"的类
 *
 * @author: alien
 * @since: 2019/09/03 22:17
 */
public class BigString {
    private BigChar[] bigChars;

    public BigString(String string) {
        bigChars = new BigChar[string.length()];
        BigCharFactory factory = BigCharFactory.getInstance();
        for (int i = 0; i < string.length(); i++) {
            bigChars[i] = factory.getBigChar(string.charAt(i));
        }
    }

    public void print() {
        for (int i = 0; i < bigChars.length; i++) {
            bigChars[i].print();
        }
    }

}
