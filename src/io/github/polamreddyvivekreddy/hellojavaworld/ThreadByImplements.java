package io.github.polamreddyvivekreddy.hellojavaworld;

public class ThreadByImplements implements Runnable{
    @Override
    public void run() {
        System.out.println("I am created by implementing Runnable Interface");
    }
}
