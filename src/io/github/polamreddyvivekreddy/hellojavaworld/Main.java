package io.github.polamreddyvivekreddy.hellojavaworld;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();
        stringList.add("timon");
        stringList.add("&&&&&&");
        stringList.add("pumba");
        stringList.add("pumba");

        // forEach
        /*System.out.println(stringList);
        stringList.forEach(name -> System.out.println(name));
        stringList.forEach(System.out::println);*/

        // distinct
        /*Stream<String> stringStream = stringList.stream().distinct();
        stringStream.forEach(System.out::println);
        stringStream.close();*/

        // map
        /*Stream<String> stringStream = stringList.stream().map(name -> name.substring(0,3));
        stringStream.forEach(System.out::println);
        stringStream.close();*/

        // filter
        /*Stream<String> stringStream = stringList.stream().filter(name -> name.startsWith("t"));
        stringStream.forEach(System.out::println);
        stringStream.close();*/

        // limit
        /*Stream<String> stringStream = stringList.stream().limit(2);
        stringStream.forEach(System.out::println);
        stringStream.close();*/

        // sort
        List<String> sortedList = stringList.stream().sorted(Comparator.reverseOrder()).toList();
        sortedList.forEach(System.out::println);


    }
}
