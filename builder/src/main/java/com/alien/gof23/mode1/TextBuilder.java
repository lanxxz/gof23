package com.alien.gof23.mode1;

/**
 * Text 文档
 *
 * @author Alien
 * @since 2019/7/13 18:28
 */
public class TextBuilder extends Builder {
    private StringBuffer buffer = new StringBuffer();

    @Override
    public void makeTitle(String title) {
        buffer.append("===========================\n");
        buffer.append("[").append(title).append("]\n").append("\n");
    }

    @Override
    public void makeString(String str) {
        buffer.append("> ").append(str).append("\n").append("\n");
    }

    @Override
    public void makeItem(String[] items) {
        for (int i  = 0; i < items.length; i++) {
            buffer.append("  .").append(items[i]).append("\n");
        }
        buffer.append("\n");
    }

    @Override
    public void close() {
        buffer.append("===========================\n");
    }

    public String getResult() {
        return buffer.toString();
    }
}
