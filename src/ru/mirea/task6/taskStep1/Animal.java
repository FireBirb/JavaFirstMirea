package ru.mirea.task6.taskStep1;

public class Animal implements Nameable {
    private String name;

    public String getName() {return "Animal: "+ this.name;}
    Animal (String name) {this.name = name;}
}
