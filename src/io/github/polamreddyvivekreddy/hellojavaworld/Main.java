package io.github.polamreddyvivekreddy.hellojavaworld;

public class Main {

    public static void main(String[] args) {
        // We need not use new Thread() because this class already extended Thread
        ThreadByExtends threadByExtends = new ThreadByExtends();
        // Thread.start() will call Thread.run()
        threadByExtends.start();

        // We need to use new Thread(Runnable) to convert to Thread
        Thread threadByImplements = new Thread(new ThreadByImplements());
//        Thread.start() will call Thread.run()
        threadByImplements.start();
    }
}
