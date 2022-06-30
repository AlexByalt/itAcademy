package by.academy.lesson4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of integers ");
        int n = sc.nextInt();
        for (int i = 1; i < n; i++) {
            System.out.println("your number " + i + ": ");
            int number = sc.nextInt();
            System.out.println(number);
            int zero = 0;
            if (number == 0) {
                zero = zero + 1;
                System.out.println("Количество нулей: " + zero);
            } else if (number > 0) {
                int plus = 0;
                plus = plus + 1;
                System.out.println("Количество положительных: " + plus);
            } else if (number < 0) {
                int minus = 0;
                minus = minus + 1;
                System.out.println("Количество отрицательных: " + minus);
            }
        }
        sc.close();
    }
}
