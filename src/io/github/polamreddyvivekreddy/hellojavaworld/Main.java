package io.github.polamreddyvivekreddy.hellojavaworld;

public class Main {

    public static void main(String[] args) {


        // We need to use new Thread(Runnable) to convert to Thread
        Thread thread1 = new Thread(new MyCustomThread(3),"Thread1");

        Thread thread2 = new Thread(new MyCustomThread(6),"Thread2");

        Thread thread3 = new Thread(new MyCustomThread(9),"Thread3");

        System.out.println(thread1.getPriority());
        System.out.println(thread2.getPriority());
        System.out.println(thread3.getPriority());

        thread1.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //thread2 will start only after thread1 completes its execution
        thread2.start();
        try {
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //thread3 will start only after thread1 completes its execution
        thread3.start();
        try {
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }





    }
}
