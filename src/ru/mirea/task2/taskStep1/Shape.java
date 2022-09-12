package ru.mirea.task2.taskStep1;

public class Shape {
    private String type;
    private double area;

    public Shape (String type, double area) {
        this.area = area;
        this.type = type;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Type - " + getType() + "\nArea - " + getArea();
    }
}
