package io.github.polamreddyvivekreddy.hellojavaworld;

public class ObserverThread implements Runnable {

    @Override
    public void run() {

        int value = 0;
        while (value < 5) {
            if (value != Main.SHARED_INT_VALUE) {
                System.out.println(Thread.currentThread().getName() + " adjusting its value as shared value changed from " + value);
                value = Main.SHARED_INT_VALUE;

            }

        }
    }
}
