package by.academy.homework2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int size = 0;
        int min = 0;
        int index = 0;
        boolean b = true;
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
            String word = words[j];
            char[] letters = new char[word.length()];
            for (int k = 0; k < word.length(); k++) {
                if (k == 0) {
                    letters[k] = word.charAt(k);
                    size++;
                } else {
                    for (int l = 0; l < letters.length; l++) {
                        if (letters[l] == word.charAt(j)) {
                            b = false;
                        }
                    }
                    if (b == true) {
                        letters[j] = word.charAt(j);
                        size++;
                    }
                }
                b = true;
            }
            if (min == 0 || min > size) {
                min = size;
                index = j;
            }
            size = 0;
        }
        System.out.println(words[index]);
    }
}
