package by.academy.lesson5;

public class Task0 {
    public static void main(String[] args) {
        String s = "Для работы со строками в языке Java используются классы String, StringBuilder, StringBuffer";
        int index = -1;
        do {
            index = s.indexOf("S", index == -1 ? 0 : index + 1);
            if (index != -1) {
                System.out.println(index);
            }
        } while (index != -1);

    }
       /* System.out.println(s.indexOf('S'));
        System.out.println(s.indexOf('S',57));
        System.out.println(s.indexOf('S'));*/
}
