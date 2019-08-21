package com.alien.mode1;

import com.alien.mode1.game.Gamer;
import com.alien.mode1.game.Memento;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;

/**
 * @program: gof23
 * @description: 主入口
 * @author: alien
 * @since: 2019/08/21 18:10
 */
public class Main {
    private static final String SAVE_FILE_NAME = "game.dat";

    public static void main(String[] args) {
        Gamer gamer = new Gamer(100);
        Memento memento = loadMemento();
        if (memento != null) {
            System.out.println("读取上次存档");
            gamer.restoreMemento(memento);
        } else {
            System.out.println("新游戏");
            memento = gamer.createMemento();
        }


        for (int i = 0; i < 100; i++) {
            System.out.println("======");
            System.out.println("当前状态：" + gamer);
            gamer.bet();
            System.out.println("所持有的金币：" + gamer.getMoney());
            if (gamer.getMoney() > memento.getMoney()) {
                System.out.println("所持有的金币增加了好多，因此保存当前状态");
                memento = gamer.createMemento();
                saveMemento(memento);
            } else if (gamer.getMoney() < memento.getMoney()/2) {
                System.out.println("所持有金币减少了好多，因此恢复至以前状态");
                gamer.restoreMemento(memento);
            }
        }
    }

    public static void saveMemento(Memento memento) {
//        try (ObjectOutput output = new ObjectOutputStream(new FileOutputStream(SAVE_FILE_NAME))) {
        // 使用压缩保存文件
        try (ObjectOutput output = new ObjectOutputStream(
                new DeflaterOutputStream(new FileOutputStream(SAVE_FILE_NAME)))) {
            output.writeObject(memento);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Memento loadMemento() {
        Memento memento = null;
//        try (ObjectInput input = new ObjectInputStream(new FileInputStream(SAVE_FILE_NAME))) {
        // 读取压缩的dat
        try (ObjectInput input = new ObjectInputStream(
                new InflaterInputStream(new FileInputStream(SAVE_FILE_NAME)))) {
            memento = (Memento) input.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return memento;
    }

}
