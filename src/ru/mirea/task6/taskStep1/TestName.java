package ru.mirea.task6.taskStep1;

public class TestName {
    public static void main(String[] args) {
        Animal cat = new Animal("cat");
        Animal dog = new Animal("dog");
        Car porsche = new Car("porsche");
        Car volkswagen = new Car("volkswagen");
        Planet earth = new Planet("Earth");
        Planet mars = new Planet("Mars");
        System.out.println(cat.getName());
        System.out.println(dog.getName());
        System.out.println(volkswagen.getName());
        System.out.println(porsche.getName());
        System.out.println(earth.getName());
        System.out.print(mars.getName());
    }
}
