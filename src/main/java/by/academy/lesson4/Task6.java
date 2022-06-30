package by.academy.lesson4;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите сумму первоначального вклада: ");
        int sum = sc1.nextInt();
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Введите количество лет: ");
        int age = sc2.nextInt();
        System.out.println("Сумма вашего вклада через " + age + " лет " + "составит " + (sum + (sum * 3 * age / 100)) + " рублей");
    }
}
