package by.academy.homework3;

import java.util.Objects;

public class Truck extends Product {
    private String truckModel;
    private double truckEngineVolume;
    private int truckYearOfRelease;

    public String getTruckModel() {
        return truckModel;
    }

    public void setTruckModel(String truckModel) {
        this.truckModel = truckModel;
    }

    public double getTruckEngineVolume() {
        return truckEngineVolume;
    }

    public void setTruckEngineVolume(double truckEngineVolume) {
        this.truckEngineVolume = truckEngineVolume;
    }

    public int getTruckYearOfRelease() {
        return truckYearOfRelease;
    }

    public void setTruckYearOfRelease(int truckYearOfRelease) {
        this.truckYearOfRelease = truckYearOfRelease;
    }

    public Truck(String prodName, double price, double quantity, double fullPrice, String truckModel, double truckEngineVolume, int truckYearOfRelease) {
        super(prodName, price, quantity, fullPrice);
        this.truckModel = truckModel;
        this.truckEngineVolume = truckEngineVolume;
        this.truckYearOfRelease = truckYearOfRelease;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Truck truck = (Truck) o;
        return Double.compare(truck.truckEngineVolume, truckEngineVolume) == 0 && truckYearOfRelease == truck.truckYearOfRelease && truckModel.equals(truck.truckModel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), truckModel, truckEngineVolume, truckYearOfRelease);
    }

    @Override
    double discount() {
        if (quantity == 5) {
            return 0.80;
        } else {
            return 1;
        }
    }

    public Truck() {
        super();
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
        motorbike.append(truckModel);
        motorbike.append(", engine volume: ");
        motorbike.append(truckEngineVolume);
        motorbike.append(", year of release: ");
        motorbike.append(truckYearOfRelease);
        return motorbike.toString();
    }
}
