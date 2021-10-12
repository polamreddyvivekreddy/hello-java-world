package io.github.polamreddyvivekreddy.hellojavaworld;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Main {

    public static void main(String[] args) {

        MountainBike mountainBike = new MountainBike(1, 20, 10);

        Class<? extends MountainBike> classObject = mountainBike.getClass();

//        getObjectName(classObject);

//        getParentClass(classObject);

//        getMethods(classObject);

        manipulateFields(mountainBike, classObject);
    }

    private static void manipulateFields(MountainBike mountainBike, Class<? extends MountainBike> classObject) {
        Field field = null;
        try {
            field = classObject.getField("seatHeight");
            field.set(mountainBike, 50);
            System.out.println(field.get(mountainBike));
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    private static void getMethods(Class<? extends MountainBike> classObject) {
        Method[] methods = classObject.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
            System.out.println(Modifier.toString(method.getModifiers()));
            System.out.println(method.getReturnType());
        }
    }

    private static void getParentClass(Class<? extends MountainBike> classObject) {
        System.out.println(classObject.getSuperclass().getName());
    }

    private static void getObjectName(Class<? extends MountainBike> classObject) {
        System.out.println("classObject.getName() = " + classObject.getName());
    }
}
