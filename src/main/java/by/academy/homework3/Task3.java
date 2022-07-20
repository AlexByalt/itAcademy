package by.academy.homework3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter date: ");
        String data = sc.next();
        RegexDeal userDate = new RegexDeal(data);
        System.out.println(userDate.dateRes);

    }
}


