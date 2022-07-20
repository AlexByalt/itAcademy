package by.academy.homework3;

import java.util.Objects;

public class Motorbike extends Product {
    private String motorbikeModel;
    private double motorbikeEngineVolume;
    private int motorbikeYearOfRelease;

    public String getMotorbikeModel() {
        return motorbikeModel;
    }

    public Motorbike() {
        super();
    }

    public void setMotorbikeModel(String motorbikeModel) {
        this.motorbikeModel = motorbikeModel;
    }

    public double getMotorbikeEngineVolume() {
        return motorbikeEngineVolume;
    }

    public void setMotorbikeEngineVolume(double motorbikeEngineVolume) {
        this.motorbikeEngineVolume = motorbikeEngineVolume;
    }

    public int getMotorbikeYearOfRelease() {
        return motorbikeYearOfRelease;
    }

    public void setMotorbikeYearOfRelease(int motorbikeYearOfRelease) {
        this.motorbikeYearOfRelease = motorbikeYearOfRelease;
    }

    public Motorbike(String prodName, double price, double quantity, double fullPrice, String motorbikeModel, double motorbikeEngineVolume, int motorbikeYearOfRelease) {
        super(prodName, price, quantity, fullPrice);
        this.motorbikeModel = motorbikeModel;
        this.motorbikeEngineVolume = motorbikeEngineVolume;
        this.motorbikeYearOfRelease = motorbikeYearOfRelease;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Motorbike motorbike = (Motorbike) o;
        return Double.compare(motorbike.motorbikeEngineVolume, motorbikeEngineVolume) == 0 && motorbikeYearOfRelease == motorbike.motorbikeYearOfRelease && motorbikeModel.equals(motorbike.motorbikeModel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), motorbikeModel, motorbikeEngineVolume, motorbikeYearOfRelease);
    }

    @Override
    double discount() {
        if (quantity == 5) {
            return 0.85;
        } else {
            return 1;
        }
    }

    public String toString() {
        StringBuilder motorbike = new StringBuilder();
        motorbike.append("Product: ");
        motorbike.append(prodName);
        motorbike.append(", price: ");
        motorbike.append(price);
        motorbike.append(", quantity: ");
        motorbike.append(quantity);
        motorbike.append(", model: ");
        motorbike.append(motorbikeModel);
        motorbike.append(", engine volume: ");
        motorbike.append(motorbikeEngineVolume);
        motorbike.append(", year of release: ");
        motorbike.append(motorbikeYearOfRelease);
        return motorbike.toString();
    }
}


