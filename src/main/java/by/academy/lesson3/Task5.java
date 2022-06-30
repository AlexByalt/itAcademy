package by.academy.lesson3;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter first num: ");
        int numOne = sc1.nextInt();
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter second num: ");
        int numTwo = sc2.nextInt();
        if (numOne > numTwo) {
            System.out.println(numOne + " больше ");
        } else {
            System.out.println(numTwo + " больше ");
        }
        if (numOne < numTwo) {
            System.out.println(numOne + " меньше ");
        } else {
            System.out.println(numTwo + " меньше ");
        }
        System.out.println((numOne + numTwo) / 2 + " среднее арифметическое");
    }
}
