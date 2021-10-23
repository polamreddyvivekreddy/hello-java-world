package io.github.polamreddyvivekreddy.hellojavaworld;

import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {

        Supplier<String> supplier = () -> "hello";
        System.out.println(supplier.get());
    }
}
