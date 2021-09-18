package io.github.polamreddyvivekreddy.hellojavaworld;

public class ActorThread implements Runnable {


    @Override
    public void run() {
        int value = 0;
        while (value < 5) {
            System.out.println(Thread.currentThread().getName() + " incrementing shared value from " + value);
            Main.SHARED_INT_VALUE = ++value;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("exception in actorThread: " + e);
            }
        }

    }
}
