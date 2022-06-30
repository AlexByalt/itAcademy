package by.academy.homework1;

import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter data type  ");
        String type = String.valueOf(sc1.nextLine());
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc2.nextInt();
        switch (type) {
            case "int":
                System.out.println("Остаток от деления на 2 равен " + (num % 2));
                break;
            case "double":
                System.out.println("70 процентов от числа " + num + " равно " + (num * 0.7d));
                break;
            case "float":
                System.out.println("Квадрат числа " + num + " равен " + (num*num));
                break;
            case "char":
                String symbol = String.valueOf(num);
                char cod = symbol.charAt(0);
                System.out.println("Код символа равен " + cod);
                break;
            case "String":
                String word = String.valueOf(num);
                System.out.println("Hello" + word);
                break;
            default:
                System.out.println("Unsupported type");

        }
    }
}
