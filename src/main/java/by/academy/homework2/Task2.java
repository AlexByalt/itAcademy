package by.academy.homework2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int minimalLetterCount = Integer.MAX_VALUE;
        int minLengthWordPos = 0;
        int n;
        System.out.println("Введите колличество слов");
        if (sc.hasNextInt()) {
            n = sc.nextInt();
        } else {
            System.out.println("Ошибка!");
            return;
        }
        String[] words = new String[n];
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Введите слово №" + (i + 1));
            words[i] = sc.nextLine();
        }
        for (int j = 0; j < words.length; j++) {
            StringBuilder wordWithoutDuplicates = new StringBuilder(words[j]);
            for (int k = 0; k < wordWithoutDuplicates.length(); k++) {
                for (int l = k + 1; l < wordWithoutDuplicates.length(); l++) {
                    if (wordWithoutDuplicates.charAt(l) == wordWithoutDuplicates.charAt(k)) {
                        wordWithoutDuplicates.deleteCharAt(l);
                        l--;
                    }
                }
            }
            if (wordWithoutDuplicates.length() < minimalLetterCount) {
                minLengthWordPos = j;
                minimalLetterCount = wordWithoutDuplicates.length();
            }
        }
        System.out.println(words[minLengthWordPos]);
    }
}