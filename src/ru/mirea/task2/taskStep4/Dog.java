package ru.mirea.task2.taskStep4;

public class Dog {
    private String name;
    private int age;
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public int getAgeinHuman() {
        return this.age*7;
    }
    @Override
    public String toString () {
        return "Name - " + getName() + ", age - " + getAge() + " (" + getAgeinHuman() + " in human years)";
    }
}
