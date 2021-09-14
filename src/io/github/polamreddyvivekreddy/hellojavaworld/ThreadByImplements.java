package io.github.polamreddyvivekreddy.hellojavaworld;

public class ThreadByImplements implements Runnable{

    private String name;

    public ThreadByImplements(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("I am "+name);
    }
}
