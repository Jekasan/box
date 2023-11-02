package ru.box;

public class Fruit {
    int weight;

    public int getWeight() {
        return weight;
    }

    public Fruit(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " " + weight;
    }
}
