package by.academy.homework3;

import java.util.Arrays;
import java.util.Scanner;

//NOT READY YET, NEED SOME TIME!!!
// THERE ARE A LOF OF BUGS(
public class Main {
    public static void main(String[] args) {
        Motorbike motorbike1 = new Motorbike("Motorbike", 10500, 2, 21000, "Suzuki", 1.2, 2005);
        Motorbike motorbike2 = new Motorbike("Motorbike", 38000, 1, 38000, "Yamaha", 1.0, 2018);
        Motorbike motorbike3 = new Motorbike("Motorbike", 1000, 2, 2000, "Minsk", 0.2, 1991);
        Car car1 = new Car("Car", 10000, 2, 2000, "Audi", 1.9, 2005);
        Car car2 = new Car("Car", 50000, 1, 50000, "Mercedes", 3.0, 2016);
        Car car3 = new Car("Car", 20000, 2, 40000, "Volkswagen", 1.6, 2017);
        Truck truck1 = new Truck("Truck", 75790, 1, 75790, "Iveco", 3.5, 2017);
        Truck truck2 = new Truck("Truck", 29200, 1, 29200, "Renault", 3.5, 2004);
        Truck truck3 = new Truck("Truck", 140000, 3, 420000, "Mercedes", 2.1, 2022);
        Product[] productList = new Product[9];

        productList[0] = motorbike1;
        productList[1] = motorbike2;
        productList[2] = motorbike3;
        productList[3] = car1;
        productList[4] = car2;
        productList[5] = car3;
        productList[6] = truck1;
        productList[7] = truck2;
        productList[8] = truck3;
        User userOne = new User();
        User userTwo = new User();
        Deal deal = new Deal();
        deal.setBuyer(userOne);
        deal.setSeller(userTwo);

        int choise = -1;
        boolean tip = false;
        String answer = "0";

        Scanner sc = new Scanner(System.in);
        ;
        do {
            System.out.println("0: menu");
            System.out.println("+: add");
            System.out.println("-: remove");
            answer = sc.next();
            switch (answer) {
                case "+": {
                    System.out.println("menu:");
                    for (int i = 0; i < productList.length; i++) {
                        System.out.println(i + 1 + ": " + productList[i].getProdName() + "-" + productList[i].getPrice() + " BYN");
                    }
                    System.out.println("0: menu");
                    do {
                        tip = false;
                        System.out.println("choose your product:");
                        if (sc.hasNextInt()) {
                            choise = sc.nextInt();

                            if (choise == 0) {
                                break;
                            }
                            if (choise < 1 || choise > productList.length) {
                                System.out.println("error");
                                tip = true;
                                continue;
                            }

                            for (int i = 0; i < deal.getProducts().length; i++) {
                                if (deal.getProduct(i) == productList[choise - 1] && deal.getProducts().length > 0) {
                                    tip = true;
                                    System.out.println("you've already added this product");
                                    break;
                                }
                            }

                            if (tip == true) {
                                continue;
                            }

                            System.out.println("enter quantity");
                            if (sc.hasNextDouble()) {
                                double q = sc.nextDouble();
                                deal.addProduct(productList[choise - 1]);
                                productList[choise - 1].setQuantity(q);
                                break;
                            }
                        }
                    } while (choise >= 1 && choise <= productList.length || tip == true);
                    break;
                }
                case "-": {
                    System.out.println("menu");
                    do {
                        tip = false;
                        System.out.println("choose your product");
                        if (sc.hasNextInt()) {
                            choise = sc.nextInt();

                            if (choise == 0) {
                                break;
                            }
                            if (choise < 1 || choise > productList.length) {
                                System.out.println("error");
                                tip = true;
                                continue;
                            }

                            for (int i = 0; i < deal.getProducts().length; i++) {
                                if (deal.getProduct(i) == productList[choise - 1] && deal.getProducts().length > 0) {
                                    deal.removeProduct(productList[choise - 1]);
                                    productList[choise - 1].setQuantity(0);
                                    tip = false;
                                    break;
                                }
                            }
                        } else {
                            System.out.println("error");
                        }
                    } while (tip == true);
                    break;
                }
                case "0": {
                    System.out.println("good choise!");
                    break;
                }
                default: {
                    System.out.println("error");
                    answer = "continue";
                }
            }
        } while (answer.equals("+") || answer.equals("-") || answer.equals("continue"));
        System.out.println(Arrays.toString(deal.getProducts()));
        sc.close();
    }
}
