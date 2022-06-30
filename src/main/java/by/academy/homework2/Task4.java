package by.academy.homework2;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        int cardsPerPlayer = 5;
        int players;
        String[] suit = {"Пики", "Бубен", "Червей", "Крести"};
        String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Валет", "Дама", "Король", "Туз"};
        int amount = suit.length * rank.length;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество игроков: ");
        players = sc.nextInt();
        if (players <= 0) {
            System.out.println("Игра не состоится");
        } else if (cardsPerPlayer * players >= amount) {
            System.out.println("Слишком много игроков");
        }
        String[] deck = new String[amount];
        for (int i = 0; i < rank.length; i++) {
            for (int j = 0; j < suit.length; j++) {
                deck[suit.length * i + j] = rank[i] + " " + suit[j];
            }
        }
        for (int i = 0; i < amount; i++) {
            int shuffling = i + (int) (Math.random() * (amount - i));
            String str = deck[shuffling];
            deck[shuffling] = deck[i];
            deck[i]= str;
        }
        for (int i = 0; i < players * cardsPerPlayer; i++) {
            System.out.println(deck[i]);
            if (i % cardsPerPlayer == cardsPerPlayer - 1)
                System.out.println();

        }
    }
}