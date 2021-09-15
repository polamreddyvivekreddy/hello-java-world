package io.github.polamreddyvivekreddy.hellojavaworld;

public class Main {

    public static void main(String[] args) {


        // Creating a common object for multiple threads
        MyCustomThread myCustomThread = new MyCustomThread(2);
        // We need to use new Thread(Runnable) to convert to Thread
        Thread thread1 = new Thread(myCustomThread,"Thread1");

        Thread thread2 = new Thread(myCustomThread,"Thread2");

        Thread thread3 = new Thread(myCustomThread,"Thread3");

        thread1.start();

        thread2.start();

        thread3.start();




    }
}
