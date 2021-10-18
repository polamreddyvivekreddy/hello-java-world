package io.github.polamreddyvivekreddy.hellojavaworld;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        OurCustomGeneric<String> ourCustomGeneric1 = new OurCustomGeneric<>();
        ourCustomGeneric1.setOurCustomObject("Vivek");
//        ourCustomGeneric1.setOurCustomObject(24); // Won't work
        ourCustomGeneric1.getOurCustomObject();

        OurCustomGeneric<Integer> ourCustomGeneric2 = new OurCustomGeneric<>();
        ourCustomGeneric2.setOurCustomObject(24);
//        ourCustomGeneric2.setOurCustomObject("Vivek"); // Won't work
        ourCustomGeneric2.getOurCustomObject();

    }
}

/**
 * 1. T -> Type
 * 2. E -> Element
 * 3. K -> Key
 * 4. N -> Number
 * 5. V -> Value
 *
 */

class OurCustomGeneric<T>{
    private T ourCustomObject;

    public T getOurCustomObject() {
        return ourCustomObject;
    }

    public void setOurCustomObject(T ourCustomObject) {
        this.ourCustomObject = ourCustomObject;
    }
}

