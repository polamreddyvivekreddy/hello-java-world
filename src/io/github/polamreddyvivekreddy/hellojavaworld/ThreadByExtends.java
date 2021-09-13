package io.github.polamreddyvivekreddy.hellojavaworld;

public class ThreadByExtends extends Thread {

    @Override
    public void run() {
        System.out.println("I am created by extending Thread class");
    }
}
