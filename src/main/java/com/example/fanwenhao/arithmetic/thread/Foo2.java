package com.example.fanwenhao.arithmetic.thread;

import java.util.concurrent.Semaphore;

/**
 * @Date 2020/7/2 11:43
 * @Version 1.0
 */
public class Foo2 {
    private Semaphore semaphore1 = new Semaphore(0);
    private Semaphore semaphore2 = new Semaphore(0);
    public void first(Runnable printFirst) throws InterruptedException {

        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        semaphore1.release();
    }

    public void second(Runnable printSecond) throws InterruptedException {

        // printSecond.run() outputs "second". Do not change or remove this line.
        semaphore1.acquire();
        printSecond.run();
        semaphore2.release();
    }

    public void third(Runnable printThird) throws InterruptedException {
        semaphore2.acquire();
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
    }
}
