package io.github.polamreddyvivekreddy.hellojavaworld;

public class InterfaceImplementor implements AnInterface{

    @Override
    public String doSomething() {
        return "only now, I have body";
    }

    @Override
    public String doSomethingElse() {
        return "purely optional to override or not as it already had a method body";
    }
}
