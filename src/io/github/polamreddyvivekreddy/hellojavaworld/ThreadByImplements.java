package io.github.polamreddyvivekreddy.hellojavaworld;

public class ThreadByImplements extends Model implements Runnable{

    @Override
    public void showData(String data) {
        System.out.println(data + " from ThreadByImplements class.");
    }

    @Override
    public void run() {
        System.out.println("I am created by implementing Runnable Interface");
    }
}
