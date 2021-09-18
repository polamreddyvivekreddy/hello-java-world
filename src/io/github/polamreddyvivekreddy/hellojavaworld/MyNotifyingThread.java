package io.github.polamreddyvivekreddy.hellojavaworld;

public class MyNotifyingThread implements Runnable {

    private Integer integerObject;

    public MyNotifyingThread(Integer integerObject) {
        this.integerObject = integerObject;
    }

    @Override
    public void run() {

        /*synchronized block to make the thread owner and to acquire obj.wait().
        With out synchronizing, integerObject.wait() throws exceptions*/
        synchronized (integerObject) {


            System.out.println(Thread.currentThread().getName() + " operating on integerObject");

            //perform operations on shared integerObject
            for (int i = 1; i <= 10; i++) {
                int result = i * integerObject;
                System.out.println(Thread.currentThread().getName() + ":" +
                        i + " * " + integerObject + " = " + result);
            }

            //notify the waitingThread
            System.out.println(Thread.currentThread().getName() + " will notify the waitingThread");
            integerObject.notify();
        }

    }
}
