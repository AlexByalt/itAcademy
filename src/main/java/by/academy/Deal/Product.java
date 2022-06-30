package by.academy.Deal;

import java.util.Objects;

public class Product {
    private double productPrice;
    private String productName;
    private int productQuantity;
    private boolean isTax;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.productPrice, productPrice) == 0 && productQuantity == product.productQuantity && isTax == product.isTax && productName.equals(product.productName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productPrice, productName, productQuantity, isTax);
    }

    public Product(double productPrice, String productName, int productQuantity, boolean isTax) {
        this.productPrice = productPrice;
        this.productName = productName;
        this.productQuantity = productQuantity;
        this.isTax = isTax;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public boolean isTax() {
        return isTax;
    }

    public void setTax(boolean tax) {
        isTax = tax;
    }

    private double discount() {
        return 1.0;
    }

    public double calcPrice() {
        return productQuantity * productPrice * discount();
    }

}
