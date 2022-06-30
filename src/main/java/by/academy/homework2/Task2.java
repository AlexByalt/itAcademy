package by.academy.homework2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Введите колличество слов");
        if (sc.hasNextInt()) {
            n = sc.nextInt();
        } else {
            System.out.println("Ошибка!");
            return;
        }
        String[] str = new String[n];
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Введите слово №" + (i + 1));
            str[i] = sc.nextLine();
        }
        for (int j = 0; j < str.length; j++) {
            for (int k = j + 1; k < str.length; j++) {
                if (str[k] == str[j]) {
                    System.out.println("число различных элементов равно " + k);
                }
            }
        }
    }
}
