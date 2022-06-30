package by.academy.homework2;

import java.util.Scanner;
import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите первое слово в четным количеством букв: ");
        String wordOne = sc1.nextLine();
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Введите второе слово в четным количеством букв: ");
        String wordTwo = sc2.nextLine();
        if ((wordOne.length() % 2 != 0) || (wordTwo.length() % 2 != 0)) {
            System.out.println("Вы ввели неверные слова");
        }
        String result1 = wordOne.substring(0,wordOne.length()/2);
        String result2 = wordTwo.substring(wordTwo.length()/2, wordTwo.length());
        System.out.println(result1+result2);
    }
}