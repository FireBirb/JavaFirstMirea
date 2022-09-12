package ru.mirea.task4;

public class Author {
    private String name, email;
    private char gender;
    Author(String name, String email, char gender) {
        this.email = email;
        this.gender = gender;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }
    public String toString() {
        return "Name: " + getName() + "\nGender: " + getGender() + "\nEmail: " + getEmail();
    }
}
