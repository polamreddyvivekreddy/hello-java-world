package io.github.polamreddyvivekreddy.hellojavaworld;

//public class ThreadByExtends extends Thread, Model {

/*The above signature signature is not valid in Java
and it is difficult to maintain code with the following way in enterprises*/

public class ThreadByExtends extends Thread {

    @Override
    public void run() {
        System.out.println("I am created by extending Thread class");
    }
}
