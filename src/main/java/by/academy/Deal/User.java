package by.academy.Deal;

import java.util.Objects;

public class User {
    private String name;
    private double money;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Double.compare(user.money, money) == 0 && name.equals(user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, money);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public User(String name, double money) {
        this.name = name;
        this.money = money;
    }
}
