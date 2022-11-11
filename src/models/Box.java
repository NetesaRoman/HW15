package models;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {

    private float weight = 0;
    private List<T> fruits = new ArrayList<>();

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }

    public List<T> getFruits() {
        return fruits;
    }

    public void addFruit(T newFruit) {
        if (newFruit != null) {
            fruits.add(newFruit);
            weight += newFruit.getWeight();
        }
    }

    public void addFruits(T[] newFruits) {
        if (newFruits != null) {
            for (T fruit : newFruits) {
                fruits.add(fruit);
                weight += fruit.getWeight();
            }
        }
    }

    public void addFruits(List<T> newFruits) {
        if (newFruits != null) {
            for (T fruit : newFruits) {
                fruits.add(fruit);
                weight += fruit.getWeight();
            }
        }
    }

    public boolean compare(Box otherBox) {
        if(otherBox != null) {
            return getWeight() == otherBox.getWeight();
        }return false;
    }

    public Box<T> merge(Box<T> otherBox) {
        Box<T> result = new Box<>();

        if (otherBox != null && otherBox.getFruits() != null) {
            for (T fruit : otherBox.getFruits()) {
                result.addFruit(fruit);
                result.setWeight(result.getWeight() + fruit.getWeight());
            }
        }
        if (!fruits.isEmpty()) {
            for (T fruit : fruits) {
                result.addFruit(fruit);
                result.setWeight(result.getWeight() + fruit.getWeight());
            }
        }


        return result;
    }


}
