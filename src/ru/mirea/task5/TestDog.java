package ru.mirea.task5;

public class TestDog {
    public static void main(String[] args) {
        Labrador dora = new Labrador("Dora", "Cream", 10);
        Spitz tonic = new Spitz("Tonic", "black", 1);
        SausageDoggo hotty = new SausageDoggo("Hotty", "browm", 5);
        System.out.println(dora.toString());
        System.out.println(tonic.toString());
        System.out.println(hotty.toString());
    }
}
