package io.github.polamreddyvivekreddy.hellojavaworld;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("hello-java-world");

        Class modelObject = Model.class;
        System.out.println(modelObject.getName());

        // fields
        System.out.println("-----fields-----");
        Field[] fields = modelObject.getFields();
        System.out.println(fields.length);
        for (int i = 0; i < fields.length; i++) {
            System.out.println(fields[i]);
        }
        // methods
        System.out.println("----methods----");
        Method[] methods = modelObject.getMethods();
        for (int i = 0; i < methods.length; i++) {
            System.out.println(methods[i]);
        }


    }
}
