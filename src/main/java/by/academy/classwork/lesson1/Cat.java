package by.academy.classwork.lesson1;

public class Cat {
    int age;
    String nickname;
    double money;
    char initials;
    boolean isHomeAnimal;

    public void grow() {
        age++;
    }

    public void sleep() {
        System.out.println("Кот спит");
    }

    public void eat() {
        System.out.println("Кот ест");
    }

    public void walk() {
        System.out.println("Кот гуляет");
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public char getInitials() {
        return initials;
    }

    public void setInitials(char initials) {
        this.initials = initials;
    }

    public boolean isHomeAnimal() {
        return isHomeAnimal;
    }

    public void setHomeAnimal(boolean isHomeAnimal) {
        this.isHomeAnimal = isHomeAnimal;
    }

    public Cat() {

    }

    public Cat(String nickname) {
        this.nickname = nickname;
        initials = nickname.charAt(0);
    }
}