package io.github.polamreddyvivekreddy.hellojavaworld;

public class Main {

    public static void main(String[] args) {


        // Creating a common object for multiple threads.
        // Object because it has wait() & notify() by default
        Integer integerObject = 10;
        // We need to use new Thread(Runnable) to convert to Thread

        Thread waitingThread = new Thread(new MyWaitingThread(integerObject),"WaitingThread");

        Thread notifyingThread = new Thread(new MyNotifyingThread(integerObject),"NotifyingThread");

        //setting priority to ensure waitingThread begins first to make the demo meaningful
        waitingThread.setPriority(Thread.MAX_PRIORITY);
        waitingThread.start();

        notifyingThread.setPriority(Thread.MIN_PRIORITY);
        notifyingThread.start();





    }
}
