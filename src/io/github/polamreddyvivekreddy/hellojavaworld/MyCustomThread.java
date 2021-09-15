package io.github.polamreddyvivekreddy.hellojavaworld;

public class MyCustomThread implements Runnable{

    private int number;

    public MyCustomThread(int number) {
        this.number = number;
    }

    @Override
    /*Without synchronized keyword
    you can see the order of threads are jumbled*/
//    public void run() {
    public synchronized void run() {
        for(int i=1;i<=10;i++){
            int result = i*number;
            System.out.println(Thread.currentThread().getName() + ":" +
                    i + " * " + number + " = " + result);
        }
    }
}
