package models;

import java.util.ArrayList;
import java.util.List;

public class Box<F extends Fruit> {

    private float weight = 0;
    private List<F> fruits = new ArrayList<>();

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }

    public List<F> getFruits() {
        return fruits;
    }

    public void addFruit(F newFruit) {
        if (!isNull(newFruit)) {
            fruits.add(newFruit);
            weight += newFruit.getWeight();
        }
    }

    public void addFruits(F[] newFruits) {
        if (!isNull(newFruits)) {
            for (F fruit : newFruits) {
                fruits.add(fruit);
                weight += fruit.getWeight();
            }
        }
    }

    public void addFruitsFromList(List<F> newFruits) {
        if (!isNull(newFruits)) {
            for (F fruit : newFruits) {
                fruits.add(fruit);
                weight += fruit.getWeight();
            }
        }
    }

    public boolean compare(Box otherBox) {
        return getWeight() == otherBox.getWeight();
    }

    public Box<F> merge(Box<F> otherBox) {
        Box<F> result = new Box<>();

        if (!isNull(otherBox) && !isNull(otherBox.getFruits())) {
            for (F fruit : otherBox.getFruits()) {
                result.addFruit(fruit);
                result.setWeight(result.getWeight() + fruit.getWeight());
            }
        }
        if (!isNull(fruits)) {
            for (F fruit : fruits) {
                result.addFruit(fruit);
                result.setWeight(result.getWeight() + fruit.getWeight());
            }
        }


        return result;
    }

    private static <T> boolean isNull(T obj) {
        if (obj == null) {
            return true;
        } else return false;
    }
}
