package ru.mirea.task3.taskStep1;

public class CircleTest {
    public static void main(String[] args) {
        Circle cir = new Circle(5);
        System.out.print(cir.toString());
        cir.setRadius(7);
        System.out.print("\n" + cir.toString());
    }
}
