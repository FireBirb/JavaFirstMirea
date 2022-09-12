package ru.mirea.task3.taskStep1;

public class Circle {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    @Override
    public String toString() {
        return "Radius - " + getRadius();
    }
}
