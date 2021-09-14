package io.github.polamreddyvivekreddy.hellojavaworld;

public class Main {

    public static void main(String[] args) {


        // We need to use new Thread(Runnable) to convert to Thread
        Thread threadByImplements1 = new Thread(new ThreadByImplements("Thread1"));
        // Thread.start() will call Thread.run()
        threadByImplements1.setPriority(Thread.NORM_PRIORITY); //5


        Thread threadByImplements2 = new Thread(new ThreadByImplements("Thread2"));
        threadByImplements2.setPriority(Thread.MIN_PRIORITY); //1 and never <1

        Thread threadByImplements3 = new Thread(new ThreadByImplements("Thread3"));
        threadByImplements3.setPriority(Thread.MAX_PRIORITY); //10 and never >10

        Thread threadByImplements4 = new Thread(new ThreadByImplements("Thread4"));
        threadByImplements4.setPriority(4); // range is 1-10 inclusive

        System.out.println(threadByImplements1.getPriority());
        System.out.println(threadByImplements2.getPriority());
        System.out.println(threadByImplements3.getPriority());
        System.out.println(threadByImplements4.getPriority());

        threadByImplements1.start();
        threadByImplements2.start();
        threadByImplements3.start();
        threadByImplements4.start();

        // main thread has priority 5 by default
        Thread.currentThread().getName();
        Thread.currentThread().getPriority();

        // TODO : Find an example to show evident difference

        // TODO : Daemon Thread demo

        /*You will see that the order might not be inline with priority because
        currently there is no enough load on CPU but this behaviour will
        be evident when you have large data processing*/


    }
}
