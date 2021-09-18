package io.github.polamreddyvivekreddy.hellojavaworld;

public class Main {

    public static void main(String[] args) {

        Class1 obj1 = new Class1();
        Class2 obj2 = new Class2();

        // We need to use new Thread(Runnable) to convert to Thread
        Thread1  thread1= new Thread1(obj1, obj2);
        thread1.start();

        Thread2  thread2= new Thread2(obj1, obj2);
        thread2.start();
    }
}
