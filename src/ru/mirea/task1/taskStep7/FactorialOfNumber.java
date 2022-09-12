package ru.mirea.task1.taskStep7;

import java.util.Scanner;

public class FactorialOfNumber {
    public static void main(String[] args) {
        int a;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        a = input.nextInt();
        if(a > 0)
            System.out.println(fact(a));
        else
            System.out.println("Error, the number must be bigger than zero");
    }
    public static int fact(int a)
    {
        if(a==0)
            return 1;
        else return a*fact(a-1);
    }
}
