package by.academy.homework3;

import java.util.Objects;

public abstract class Product {
    protected String prodName;
    protected double price;
    protected double quantity;
    protected double fullPrice;

    abstract double discount();

    public double getFullPrice() {
        return quantity * fullPrice;
    }

    public void setFullPrice(double fullPrice) {
        this.fullPrice = fullPrice;
    }

    public Product() {
        super();
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public Product(String prodName, double price, double quantity, double fullPrice) {
        this.prodName = prodName;
        this.price = price;
        this.quantity = quantity;
        this.fullPrice = fullPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 && Double.compare(product.quantity, quantity) == 0 && prodName.equals(product.prodName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(prodName, price, quantity);
    }


    public double getCalcFinalPrice() {
        return price * quantity * discount();
    }

    public String toString() {
        StringBuilder prod = new StringBuilder();
        prod.append("Product: ");
        prod.append(prodName);
        prod.append(", price: ");
        prod.append(price);
        prod.append(", quantity: ");
        prod.append(quantity);
        return prod.toString();
    }
}