package io.github.polamreddyvivekreddy.hellojavaworld.package1;

public abstract class AbstractClassModel {

    private final String name;

    public AbstractClassModel(String name) {
        this.name = name;
    }

    public abstract String getName();

    public String getNickName(){
        return "nickName";
    }

}
