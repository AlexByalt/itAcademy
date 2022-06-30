package by.academy.lesson5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task8 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("c*ab");
        Matcher matcher = pattern.matcher( "cab");
        Matcher matcher1 = pattern.matcher("ccab");
        Matcher matcher2 = pattern.matcher("cccab");
        boolean a = matcher.matches();
        boolean b = matcher1.matches();
        boolean c = matcher2.matches();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
