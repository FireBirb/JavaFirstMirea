package ru.mirea.task2.taskStep2;

import java.awt.*;

public class Ball {
    private Color color;
    private String owner;
    private double price;

    Ball (Color color, String owner, double price) {
        this.color = color;
        this.owner = owner;
        this.price = price;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
    @Override
    public String toString() {
        return "Color - " + getColor() + "\nBelongs to " + getOwner() + "\nPrice: " + getPrice();
    }
}
