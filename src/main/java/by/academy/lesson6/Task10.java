package by.academy.lesson5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Task10 {
    public static void main(String[] args) {
        String str = "Versions: Java  5, Java 6, Java   7, Java 8, Java 12.";
        Pattern pattern = Pattern.compile("\\D{4}+\\s{1,}+\\d");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            System.out.print(matcher.group());
        }
    }

}