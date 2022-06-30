package by.academy.lesson3;

import java.util.Scanner;

public class Task0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter: ");
        String month = sc.next();
        month = month.toLowerCase();
        switch (month) {
            case "january":
                System.out.println("1st");
                break;
            case "fabruary":
                System.out.println("2nd");
                break;
            case "march":
                System.out.println("3rd");
                break;
            case "april":
                System.out.println("4th");
                break;
            case "may":
                System.out.println("5th");
                break;
            case "june":
                System.out.println("6th");
                break;
            default:
                System.out.println("error");
        }
    }
}
