package io.github.polamreddyvivekreddy.hellojavaworld;

import java.util.concurrent.BlockingQueue;

public class ProducerThread implements Runnable{

    private BlockingQueue<Integer> blockingQueue;

    public ProducerThread(BlockingQueue<Integer> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        int value = 0;
        while(true){
            try {
                blockingQueue.put(value);
                System.out.println("produced "+value);
                value = value+1;

                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("exception in producerThread: "+e);
            }
        }

    }
}
