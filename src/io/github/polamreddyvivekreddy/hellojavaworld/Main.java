package io.github.polamreddyvivekreddy.hellojavaworld;

public class Main {

    public static void main(String[] args) {

        Sports sports = ()-> System.out.println("Welcome to selection");
        sports.doSelection();

    }

    @FunctionalInterface
    interface Sports{
        void doSelection();
    }
}
