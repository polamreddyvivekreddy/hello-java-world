package io.github.polamreddyvivekreddy.hellojavaworld;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();
        stringList.add("Vivek");
        stringList.add("24");

        // Doesn't allow even at compile time
//        stringList.add(24);

        String name = stringList.get(0);

        // Doesn't allow even at compile time
//        int age = stringList.get(1);
    }
}
