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
        for (int w = 0; w < n; w++) {
            System.out.println("Введите слово №" + (w + 1));
            words[w] = sc.nextLine();
        }
        for (int i = 0; i < words.length; i++) {
            StringBuilder wordWithoutDuplicates = new StringBuilder(words[i]);
            for (int j = 0; j < wordWithoutDuplicates.length(); j++) {
                for (int k = j + 1; k < wordWithoutDuplicates.length(); k++) {
                    if (wordWithoutDuplicates.charAt(k) == wordWithoutDuplicates.charAt(j)) {
                        wordWithoutDuplicates.deleteCharAt(k);
                        k--;
                    }
                }
            }
            if (wordWithoutDuplicates.length() < minimalLetterCount) {
                minLengthWordPos = i;
                minimalLetterCount = wordWithoutDuplicates.length();
            }
        }
        System.out.println(words[minLengthWordPos]);
    }
}