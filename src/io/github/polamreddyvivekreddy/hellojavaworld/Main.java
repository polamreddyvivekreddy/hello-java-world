package io.github.polamreddyvivekreddy.hellojavaworld;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        CustomGenericMethod customGenericMethod = new CustomGenericMethod();
        Integer[] integers = {1, 2, 3, 4};
        String[] strings = {"a", "b", "c", "d"};

        customGenericMethod.getElements(integers);
        customGenericMethod.getElements(strings);

    }
}

/**
 * 1. T -> Type
 * 2. E -> Element
 * 3. K -> Key
 * 4. N -> Number
 * 5. V -> Value
 */

class CustomGenericMethod {
    public <E> void getElements(E[] elements) {
        for (int i = 0; i < elements.length; i++) {
            System.out.println(elements[i]);
        }
    }
}

