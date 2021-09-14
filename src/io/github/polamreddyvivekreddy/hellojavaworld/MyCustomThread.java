package io.github.polamreddyvivekreddy.hellojavaworld;

public class MyCustomThread implements Runnable{

    private int number;

    public MyCustomThread(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println("I am "+ Thread.currentThread().getName());
        for(int i=1;i<=10;i++){
            int result = i*number;
            System.out.println(i + " * " + number + " = " + result);
        }
    }
}
