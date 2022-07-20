package by.academy.homework3;

//NOT READY YET, NEED SOME TIME!!!
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

    }
}
