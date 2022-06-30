package by.academy.homework1;

public class ExpTwo {
    public static void main(String[] args) {
        int number = 2;
        int result = 1;
        int degree = 1;
        while (result < 1000000) {
            result = result * number;
            System.out.println(number + " в степени " + degree + " = " + result);
            degree++;
        }
    }
}