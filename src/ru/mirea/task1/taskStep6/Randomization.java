package ru.mirea.task1.taskStep6;

import java.util.Random;

public class Randomization {
    public static void main(String[] args) {
        int []m_arr = new int[25];
        int []r_arr = new int[25];
        Random rand = new Random();
        for (int i = 0; i<25; i++) {
            m_arr[i] = (int) (Math.random()*200)-100;
            System.out.print(m_arr[i] + " ");
        }
        for (int i = 0; i < 25; i++) {
            for (int j = i; j < 25; j++) {
                if (m_arr[i] > m_arr[j]) {
                        int temp = m_arr[i];
                        m_arr [i] = m_arr[j];
                        m_arr [j] = temp;
                }
            }
        }
        System.out.print("\n");
        for (int i = 0; i<25; i++) {
            System.out.print(m_arr[i] + " ");
        }

        System.out.print("\n\n");
        for (int i = 0; i<25; i++) {
            r_arr[i] = rand.nextInt(200)-100;
            System.out.print(r_arr[i] + " ");
        }
        for (int i = 0; i < 25; i++) {
            for (int j = i; j < 25; j++) {
                if (r_arr[i] > r_arr[j]) {
                    int temp = r_arr[i];
                    r_arr [i] = r_arr[j];
                    r_arr [j] = temp;
                }
            }
        }
        System.out.print("\n");
        for (int i = 0; i<25; i++) {
            System.out.print(r_arr[i] + " ");
        }
    }
}
