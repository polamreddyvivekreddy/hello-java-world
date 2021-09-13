package io.github.polamreddyvivekreddy.hellojavaworld;

public class Main {

    public static void main(String[] args) {

        /*Suppose we want to override methods from a Business Model
        and use Thread(s), then we need to implement Runnable only
        because Java doesn't support multiple inheritance
        meaning : one class can extend only one class (never >1)*/


        // Creating Runnable object to pass into thread
        ThreadByImplements threadByImplements = new ThreadByImplements();
        // We need to use new Thread(Runnable) to convert to Thread
        Thread thread = new Thread(threadByImplements);
        // Thread.start() will call Thread.run()
        thread.start();
        threadByImplements.showData("hello");


    }
}
