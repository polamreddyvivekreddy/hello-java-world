package io.github.polamreddyvivekreddy.hellojavaworld;

public class MyWaitingThread implements Runnable {

    private Integer integerObject;

    public MyWaitingThread(Integer integerObject) {
        this.integerObject = integerObject;
    }

    @Override
    public void run() {

        /*synchronized block to make the thread owner and to acquire obj.wait().
        With out synchronizing, integerObject.wait() throws exceptions*/
        synchronized (integerObject) {

            try {
                System.out.println(Thread.currentThread().getName() + " obtained the wait() on integerObject");
                integerObject.wait();
            } catch (InterruptedException e) {
                System.out.println("exception in waitingThread");
            }

            for (int i = 1; i <= 10; i++) {
                int result = i * integerObject;
                System.out.println(Thread.currentThread().getName() + ":" +
                        i + " * " + integerObject + " = " + result);
            }
        }

    }
}
