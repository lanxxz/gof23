package com.alien.gof23.sigleton;

import java.util.concurrent.atomic.AtomicReference;

/**
 * 借助 CAS 机制实现单例模式<br/>
 * 这种方式可以不适用 synchronized 和 lock，不使用 ClassLoader 的线程安全机制实现线程安全<br/>
 *
 * @author Alien
 * @since 2019/6/28 23:18
 */
public class Sigleton4CAS {
    private static final AtomicReference<Sigleton4CAS> INSTANCE = new AtomicReference<>();

    private Sigleton4CAS() {}

    public static Sigleton4CAS getInstance() {
        // 缺点：
        // 如果一直在等待（执行不成功），会造成较大的 CPU 执行开销
        for(;;) {
            Sigleton4CAS sigleton4CAS = INSTANCE.get();
            if (sigleton4CAS != null) {
                return sigleton4CAS;
            }

            sigleton4CAS = new Sigleton4CAS();
            if (INSTANCE.compareAndSet(null, sigleton4CAS)) {
                return  sigleton4CAS;
            }
        }
    }
}
