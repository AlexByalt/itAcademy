package by.academy.homework3;

import java.util.Objects;

public class Car extends Product {
    private String carModel;
    private double carEngineVolume;
    private int carYearOfRelease;

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public double getCarEngineVolume() {
        return carEngineVolume;
    }

    public void setCarEngineVolume(double carEngineVolume) {
        this.carEngineVolume = carEngineVolume;
    }

    public int getCarYearOfRelease() {
        return carYearOfRelease;
    }

    public void setCarYearOfRelease(int carYearOfRelease) {
        this.carYearOfRelease = carYearOfRelease;
    }

    public Car(String prodName, double price, double quantity, double fullPrice, String carModel, double carEngineVolume, int carYearOfRelease) {
        super(prodName, price, quantity, fullPrice);
        this.carModel = carModel;
        this.carEngineVolume = carEngineVolume;
        this.carYearOfRelease = carYearOfRelease;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Car car = (Car) o;
        return Double.compare(car.carEngineVolume, carEngineVolume) == 0 && carYearOfRelease == car.carYearOfRelease && carModel.equals(car.carModel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), carModel, carEngineVolume, carYearOfRelease);
    }

    @Override
    double discount() {
        if (quantity == 5) {
            return 0.95;
        } else {
            return 1;
        }
    }

    public Car() {
        super();
    }

    public String toString() {
        StringBuilder car = new StringBuilder();
        car.append("Product: ");
        car.append(prodName);
        car.append(", price: ");
        car.append(price);
        car.append(", quantity: ");
        car.append(quantity);
        car.append(", model: ");
        car.append(carModel);
        car.append(", engine volume: ");
        car.append(carEngineVolume);
        car.append(", year of release: ");
        car.append(carYearOfRelease);
        return car.toString();
    }
}

