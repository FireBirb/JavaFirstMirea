package ru.mirea.task2.taskStep5;

import ru.mirea.task2.taskStep4.Dog;
import java.util.ArrayList;

public class TestDog {
    public static void main(String[] args) {
        ArrayList<Dog> dogs = new ArrayList<>();

        dogs.add(new Dog("Shelly", 3));
        dogs.add(new Dog("Sumo", 7));
        dogs.add(new Dog("Sam", 14));

        dogPrinter(dogs);
    }

    private static void dogPrinter(ArrayList<Dog> dogs) {
        for (Dog dog : dogs) System.out.println(dog);
    }
}