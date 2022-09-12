package ru.mirea.task1.taskStep3;

import java.util.Scanner;

public class ArrSum {
    public static void main(String[] args) {
        int circle = 1;
        while (circle == 1){
            int sum = 0;
            Scanner input = new Scanner(System.in);
            System.out.print("Input size of an array: ");
            int n = input.nextInt();
            for (int i = n; i != 0; i--) {
                sum = sum + i;
            }
            System.out.println("Sum:" + sum + "\nStay?(1 - yes, anything else - no):");
            circle = input.nextInt();
        }
    }
}
