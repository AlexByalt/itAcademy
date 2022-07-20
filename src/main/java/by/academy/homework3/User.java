package by.academy.homework3;

import java.util.Objects;

public class User {
    private String name;
    private double money;
    private String phoneNum;
    private String email;
    private String dateOfBirth;

    public User() {
        super();
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

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        RegexDeal regexp = new RegexDeal(dateOfBirth);
        if (regexp.dateRes == true) {
            this.dateOfBirth = dateOfBirth;
        } else {
            System.out.println("Error");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Double.compare(user.money, money) == 0 && name.equals(user.name) && phoneNum.equals(user.phoneNum) && email.equals(user.email) && dateOfBirth.equals(user.dateOfBirth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, money, phoneNum, email, dateOfBirth);
    }

    public void setValidPhoneNumber(String phone) {
        Validator belNum = new BelarusPhoneValidator();
        if (belNum.isValid(phone)) {
            this.phoneNum = phone;
        } else {
            System.out.println("wrong number: " + phone);
        }
    }

    public void setValidAmericanPhoneNumber(String phone) {
        Validator UsNum = new AmericanPhoneValidator();
        if (UsNum.isValid(phone)) {
            this.phoneNum = phone;
        } else {
            System.out.println("wrong number: " + phone);
        }
    }

    public void setValidEmail(String email) {
        Validator em = new EmailValidator();
        if (em.isValid(email)) {
            this.email = email;
        } else {
            System.out.println("wrong email: " + email);
        }
    }

    public String toString() {
        StringBuilder user = new StringBuilder();
        user.append("User: ");
        user.append(name);
        user.append(", money: ");
        user.append(money);
        user.append(", phone number: ");
        user.append(phoneNum);
        user.append(", email: ");
        user.append(email);
        return user.toString();
    }
}