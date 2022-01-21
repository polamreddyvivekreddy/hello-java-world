package io.github.polamreddyvivekreddy.hellojavaworld.package1;

public class ASubClass extends AbstractClassModel{

    public ASubClass(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return "am overridden in ASubClass";
    }
}
