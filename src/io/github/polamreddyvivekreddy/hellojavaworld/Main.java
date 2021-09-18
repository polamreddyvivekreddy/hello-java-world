package io.github.polamreddyvivekreddy.hellojavaworld;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {

    public static void main(String[] args) {

        // Helps in implementing Producer Consumer Design Pattern
        BlockingQueue<Integer> blockingQueue = new LinkedBlockingQueue<>(5);

        // We need to use new Thread(Runnable) to convert to Thread
        Thread producerThread = new Thread(new ProducerThread(blockingQueue), "producerThread");
        Thread consumerThread = new Thread(new ConsumerThread(blockingQueue), "consumerThread");

        producerThread.start();
        consumerThread.start();

        // TODO: Find a relevant example
        /*producerThread.join();
        consumerThread.join();*/

    }
}



