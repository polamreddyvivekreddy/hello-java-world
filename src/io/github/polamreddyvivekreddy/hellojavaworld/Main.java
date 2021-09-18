package io.github.polamreddyvivekreddy.hellojavaworld;

public class Main {

    static volatile int SHARED_INT_VALUE = 0;

    public static void main(String[] args) {


        // We need to use new Thread(Runnable) to convert to Thread
        Thread actorThread = new Thread(new ActorThread(), "actorThread");
        Thread observerThread = new Thread(new ObserverThread(), "observerThread");

        actorThread.start();
        observerThread.start();


    }
}



