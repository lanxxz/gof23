package com.alien.mode2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @program: gof23
 * @description: 观察者模式实现的集合
 * @author: alien
 * @since: 2019/08/21 16:34
 */
public class ObservableSet<E> extends ForwaringSet<E> {
    public ObservableSet(Set<E> set) {
        super(set);
    }

//    private final List<SetObserver<E>> observers = new ArrayList<>();
    // 并发集合，避免死锁或异常
    private final List<SetObserver<E>> observers = new CopyOnWriteArrayList<>();

    public void addObserver(SetObserver<E> observer) {
        observers.add(observer);
    }

    public boolean removeObserver(SetObserver<E> observer) {
        return observers.remove(observer);
    }

    private void notifyElementAdded(E element) {
        for (SetObserver<E> observer: observers) {
            observer.added(this, element);
        }
    }

    @Override
    public boolean add(E e) {
        boolean added = super.add(e);
        if (added) {
            notifyElementAdded(e);
        }
        return added;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        boolean result = false;
        for (E element: c) {
            result |= add(element);
        }
        return result;
    }
}
