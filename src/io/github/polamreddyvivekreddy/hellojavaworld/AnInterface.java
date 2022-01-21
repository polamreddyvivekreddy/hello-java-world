package io.github.polamreddyvivekreddy.hellojavaworld;

public interface AnInterface {

    // methods in interface are always public abstract by default(not default keyword, just english :) )
    String doSomething();

    default String doSomethingElse() {
        return "interfaces can have methods when using default keyword since java 8";
    }

    default String doSomethingElseMore() {
        return "interfaces can have more than 1 default method";
    }
}
