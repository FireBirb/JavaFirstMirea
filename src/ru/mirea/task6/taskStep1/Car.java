package ru.mirea.task6.taskStep1;

public class Car implements Nameable {
    private String name;

    public String getName() {return "Car: " + this.name;}
    Car (String name) {this.name = name;}
}
