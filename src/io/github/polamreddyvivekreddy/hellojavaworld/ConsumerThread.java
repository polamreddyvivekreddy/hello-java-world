package io.github.polamreddyvivekreddy.hellojavaworld;

import java.util.concurrent.BlockingQueue;

public class ConsumerThread implements Runnable{

    private BlockingQueue<Integer> blockingQueue;

    public ConsumerThread(BlockingQueue<Integer> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());

        while(true){
            try {
                int value = blockingQueue.take();
                System.out.println("consumed "+value);

                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("exception in consumerThread: "+e);
            }
        }
    }
}
