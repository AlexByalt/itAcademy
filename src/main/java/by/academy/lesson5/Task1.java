package by.academy.lesson5;

import java.util.Locale;

public class Task1 {
    public static void main(String[] args) {
        String s = "I like Java!";
        System.out.println(s);

        System.out.println(s.charAt(s.length()-1));

        System.out.println(s.endsWith("!!!"));

        System.out.println(s.startsWith("i like"));

        System.out.println(s.contains("Java"));

        System.out.println(s.indexOf("Java"));

        System.out.println(s.replace("a", "o"));

        System.out.println(s.toLowerCase(Locale.ROOT));

        System.out.println(s.toUpperCase(Locale.ROOT));

        System.out.println(s.substring(7,11));


    }
}
