package service;

import models.Apple;
import models.Box;
import models.Fruit;
import models.Orange;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Apple a1 = new Apple("Red");
        Orange o1 = new Orange();
        Apple a2 = new Apple("Green");
        Orange o2 = new Orange();
        Apple a3 = new Apple("Green");
        Apple[] aAr = {new Apple("Green"), new Apple("Green")};


        Box<Orange> box2 = new Box<>();
        Box<Apple> box1 = new Box<>();
        Box<Apple> box3 = new Box<>();

        box1.addFruit(a1);
        box1.addFruit(a2);
        box1.addFruit(a3);
        box2.addFruit(o1);
        box2.addFruit(o2);
        box3.addFruits(aAr);


        System.out.println("Сравнение коробок:");
        System.out.println(box1.compare(box2));


    }

    public static <T> List toList(T[] targetArray) {
        List<T> outList = new ArrayList<T>();

        if (isNull(targetArray)) {
            return null;
        }

        for (T item : targetArray) {
            outList.add(item);
        }

        return outList;
    }

    public static <T> boolean isNull(T obj) {
        if (obj == null) {
            return true;
        } else return false;
    }
}