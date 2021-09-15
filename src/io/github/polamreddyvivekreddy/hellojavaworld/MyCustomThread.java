package io.github.polamreddyvivekreddy.hellojavaworld;

public class MyCustomThread implements Runnable{

    private int number;

    public MyCustomThread(int number) {
        this.number = number;
    }

    @Override

    /*When method has some operations which doesn't require synchronization,
    it is wise to synchronize only that particular block for effective usage of CPU*/
    public void run() {

        // Non-sensitive data below for multiple threads, no synchronization required
        System.out.println("hello, I am called : " + Thread.currentThread().getName());

        // sensitive data below for multiple threads
        // this means the current object
        synchronized (this){

            System.out.println("welcome " + Thread.currentThread().getName() +  ", to synchronized block of printing multiples \n "  +
            "other threads cannot access printing of multiples before I complete my work ");

            for(int i=1;i<=10;i++){
                int result = i*number;
                System.out.println(Thread.currentThread().getName() + ":" +
                        i + " * " + number + " = " + result);
            }
        }

        // Non-sensitive data below for multiple threads, no synchronization required
        System.out.println("bye, I reached end of code : " + Thread.currentThread().getName());

    }
}
