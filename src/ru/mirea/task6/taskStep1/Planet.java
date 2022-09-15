package ru.mirea.task6.taskStep1;

public class Planet implements Nameable {
    private String name;

    public String getName() {return "Planet: " + this.name;}
    Planet (String name) {this.name = name;}
}
