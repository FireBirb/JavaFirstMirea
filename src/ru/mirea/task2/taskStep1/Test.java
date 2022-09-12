package ru.mirea.task2.taskStep1;

public class Test {
    public static void main(String[] args) {
        Shape sh = new Shape ("Квадрат", 20);
        System.out.println(sh.toString());
        sh.setArea(30);
        sh.setType("Круг");
        System.out.print(sh.toString());
    }
}
