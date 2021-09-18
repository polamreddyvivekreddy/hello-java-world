package io.github.polamreddyvivekreddy.hellojavaworld;

public class Thread1 extends Thread{

    private Class1 obj1;
    private Class2 obj2;

    public Thread1(Class1 obj1, Class2 obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    @Override
    public void run() {
        synchronized (obj1){
            System.out.println("Thread1 got lock on obj1, waiting to acquire lock on obj2");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (obj2){
                System.out.println("Thread1 got lock on obj2");
            }
        }
    }
}
