package io.github.polamreddyvivekreddy.hellojavaworld;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyCustomThread implements Runnable {

    private int number;

    //Lock is an interface, ReentrantLock is the implementation
    private Lock locker = new ReentrantLock();

    public MyCustomThread(int number) {
        this.number = number;
    }

    @Override
    public void run() {

        // Non-sensitive data below for multiple threads, no synchronization required
        System.out.println("hello, I begin the journey : " + Thread.currentThread().getName());

        // sensitive data below for multiple threads
        /* lock can help in synchronization especially
         when you have a series of synchronized and non-synchronized block.
         In such cases, using many synchronized blocks makes code look ugly and also error prone */
        try{
            locker.lock();
            System.out.println("welcome " + Thread.currentThread().getName() + ", after locker.lock() for printing multiples \n " +
                    "other threads cannot access printing of multiples before I complete my multiples ");

            for (int i = 1; i <= 10; i++) {
                int result = i * number;
                System.out.println(Thread.currentThread().getName() + ":" +
                        i + " * " + number + " = " + result);
            }
        } catch (Exception e) {
            System.out.println("exception during printing multiples: "+e);
        }finally {
            locker.unlock(); //even if some error occurs in try block, lock is unlocked in finally block for the sake of other threads
        }




        // Non-sensitive data below for multiple threads, no synchronization required
        System.out.println("bye, I reached end of code : " + Thread.currentThread().getName());

    }
}
