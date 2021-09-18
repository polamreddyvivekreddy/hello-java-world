package io.github.polamreddyvivekreddy.hellojavaworld;

public class Thread2 extends Thread{

    private Class1 obj1;
    private Class2 obj2;

    public Thread2(Class1 obj1, Class2 obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    @Override
    public void run() {
        // deadlock : order of synchronization on objects is different between Thread1 & Thread2
        /*synchronized (obj2){
            System.out.println("Thread2 got lock on obj2, waiting to acquire lock on obj1");
            synchronized (obj1){
                System.out.println("Thread2 got lock on obj1");
            }
        }*/

        // solution : order of synchronization on objects is same between Thread1 & Thread2
        synchronized (obj1){
            System.out.println("Thread2 got lock on obj1, waiting to acquire lock on obj2");
            synchronized (obj2){
                System.out.println("Thread2 got lock on obj2");
            }
        }
    }
}
