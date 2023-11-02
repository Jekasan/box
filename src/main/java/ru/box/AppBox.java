package ru.box;

public class AppBox {
    public static void main(String[] args) {
        Box<Fruit> fruit = new Box<>();
        Box<Apple> apple = new Box<>();
        Box<Orange> orange = new Box<>();

        fruit.add(new Fruit(15));
        System.out.println("fruit = " + fruit);
        System.out.println();

        apple.add(new Apple(30));
        System.out.println("apple = " + apple);
        System.out.println();

        orange.add(new Orange(20));
        System.out.println("orange = " + orange);
        System.out.println();

        System.out.println("Фрукты: " + fruit);
        System.out.println("Яблоки: " + apple);
        System.out.println("Апельсины: " + orange);
        System.out.println();

        System.out.println("Спавнение apple & fruit: " + apple.compare(fruit));
        System.out.println();

        apple.moveTo(fruit);

        System.out.println("Фрукты: " + fruit);
        System.out.println("Яблоки: " + apple);
        System.out.println("Апельсины: " + orange);
    }
}
