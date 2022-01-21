package io.github.polamreddyvivekreddy.hellojavaworld;

import io.github.polamreddyvivekreddy.hellojavaworld.package1.ASubClass;
import io.github.polamreddyvivekreddy.hellojavaworld.package1.AbstractClassModel;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // if there is no subclass, we implement it during creation.
        AbstractClassModel abstractClassModel = new AbstractClassModel("helloAbstract") {
            @Override
            public String getName() {
                return "myName";
            }
        };
        System.out.println(abstractClassModel.getName());

        AbstractClassModel abstractClassModel1 = new ASubClass("helloAbstract");
        System.out.println(abstractClassModel1.getName());

    }
}
