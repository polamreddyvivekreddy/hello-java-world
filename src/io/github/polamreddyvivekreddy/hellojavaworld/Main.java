package io.github.polamreddyvivekreddy.hellojavaworld;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // UpperBound Wildcards example
        List<Circle> circles = new ArrayList<>();
        circles.add(new Circle());

        List<Polygon> polygons = new ArrayList<>();
        polygons.add(new Polygon());

        MyDrawings myDrawings = new MyDrawings();
        myDrawings.myDraw(circles);
        myDrawings.myDraw(polygons);

        // Unbound Wildcard example
        List<String> strings = new ArrayList<>();
        strings.add("a");
        strings.add("b");

        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);

        MyUnBoundExample myUnBoundExample = new MyUnBoundExample();
        myUnBoundExample.printItems(strings);
        myUnBoundExample.printItems(integers);

        // Lowerbound example
        List<Number> numbers = new ArrayList<>();
        numbers.add(10L);
        numbers.add(20L);

        MyLowerBoundExample myLowerBoundExample = new MyLowerBoundExample();
        myLowerBoundExample.printItems(integers);
        myLowerBoundExample.printItems(numbers);


    }
}

/**
 * 1. T -> Type
 * 2. E -> Element
 * 3. K -> Key
 * 4. N -> Number
 * 5. V -> Value
 */

interface Draw{
    void drawing();
}

class Circle implements Draw{

    @Override
    public void drawing() {
        System.out.println("Drawing circle");
    }
}

class Polygon implements Draw{

    @Override
    public void drawing() {
        System.out.println("Drawing polygon");
    }
}

/**
 * UpperBound Wildcards
 * <? extends Draw>
 * The above restricts the unknown to be of specific type only
 *
 */

class MyDrawings{
    public void myDraw(List<? extends Draw> drawingList){
        for(Draw draw: drawingList){
            draw.drawing();
        }

    }
}

/**
 * Unbounded Wildcards
 * List<?>
 * The above represents list of unknown types
 *
 */

class MyUnBoundExample {
    public void printItems(List<?> itemList){
        for(Object obj: itemList){
            System.out.println(obj);
        }

    }
}

/**
 * Lower bounded Wildcards
 * List<? super Integer>
 * The above represents list of unknown types and parents of Integer
 *
 */

class MyLowerBoundExample{
    public void printItems(List<? super Integer> itemList){
        for(Object obj: itemList){
            System.out.println(obj);
        }

    }
}