package ru.mirea.task2.taskStep3;

public class Book {
    private String name;
    private String author;
    private double year;

    Book (String name, String author, double year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setYear(double year) {
        this.year = year;
    }

    public double getYear() {
        return year;
    }
    @Override
    public String toString() {
        return "name - " + getName() + "\nWritten by " + getAuthor() + "\nYear: " + getYear();
    }
}
