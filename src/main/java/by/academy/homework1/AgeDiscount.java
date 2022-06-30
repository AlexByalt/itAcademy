package by.academy.homework1;

import java.util.Scanner;

public class AgeDiscount {
    public static void main(String[] args) {
        Scanner sum = new Scanner(System.in);
        System.out.println("Введите сумму покупки: ");
        int numOne = sum.nextInt();
        Scanner age = new Scanner(System.in);
        System.out.println("Введите Ваш возраст: ");
        int numTwo = age.nextInt();
        if (numOne < 100) {
            float a = numOne * 0.95f;
            System.out.println("Стоимость покупки с учетом скидка равна " + a + " рублей ");
        } else if (numOne >= 100 && numOne < 200) {
            float b = numOne * 0.93f;
            System.out.println("Стоимость покупки с учетом скидка равна " + b + " рублей ");
        } else if (numOne >= 200 && numOne < 300) {
            if (numTwo >= 18) {
                float c = numOne * 0.84f;
                System.out.println("Стоимость покупки с учетом скидка равна " + c + " рублей ");
            } else {
                float d = numOne * 0.91f;
                System.out.println("Стоимость покупки с учетом скидка равна " + d + " рублей ");
            }
        } else if (numOne >= 300 && numOne < 400) {
            float e = numOne * 0.85f;
            System.out.println("Стоимость покупки с учетом скидка равна " + e + " рублей ");
        } else if (numOne >= 400) {
            float f = numOne * 0.8f;
            System.out.println("Стоимость покупки с учетом скидка равна " + f + " рублей ");
        } else {
            System.out.println("Введена неверная сумма ");
        }
    }
}