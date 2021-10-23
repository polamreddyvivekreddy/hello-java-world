package io.github.polamreddyvivekreddy.hellojavaworld;

import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {

        /*Consumer<String> consumer = string -> System.out.println(string);
        consumer.accept("hello consumer");*/

        Consumer<Person> consumer = person -> System.out.println(person);
        consumer.accept(new Person("vivek","21"));


    }
}
class Person{
    String name;
    String age;


    public Person(String name, String age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}