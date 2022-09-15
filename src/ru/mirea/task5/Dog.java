package ru.mirea.task5;

abstract class Dog {
    protected String breed, tailType, fur_type, size, color, name;
    int age;

    public String getBreed() {
        return breed;
    }

    public String getFur_type() {
        return fur_type;
    }

    public String getSize() {
        return size;
    }

    public String getTailType() {
        return tailType;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString(){
        return "Name: " + getName() + "\nAge: " + getAge() + "\nBreed: " + getBreed() + "\nSize: " + getSize() + "\nFur type: " + getFur_type() + "\nColor: " + getColor() + "\nTail type: " + getTailType();
    }
}
