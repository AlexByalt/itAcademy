package by.academy.lesson5;

public class Task2 {
    public static void main(String[] args) {
        StringBuilder str1 = new StringBuilder();
        str1.append("3");
        str1.append(" + ");
        str1.append("56");
        str1.append(" = ");
        str1.append("59");
        System.out.println(str1);
        /*str1.deleteCharAt(7);
        str1.insert(7, "равно");*/
        System.out.println(str1);
        str1.replace(str1.indexOf("="), str1.indexOf("=")+1, "равно");
        System.out.println(str1);

        StringBuilder str2 = new StringBuilder();
        str2.append("3");
        str2.append(" - ");
        str2.append("56");
        str2.append(" = ");
        str2.append("-53");
        System.out.println(str2);

        StringBuilder str3 = new StringBuilder();
        str3.append("3");
        str3.append(" * ");
        str3.append("56");
        str3.append(" = ");
        str3.append("168");
        System.out.println(str3);


    }
}
