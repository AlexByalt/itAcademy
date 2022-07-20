package by.academy.homework3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Objects;

public class Deal {
    private User seller;
    private User buyer;
    private Product[] products;
    private LocalDateTime buyTime;
    private LocalDate deadLineDate;
    private int index = 0;

    public User getSeller() {
        return seller;
    }

    public void setSeller(User seller) {
        this.seller = seller;
    }

    public User getBuyer() {
        return buyer;
    }

    public void setBuyer(User buyer) {
        this.buyer = buyer;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public LocalDateTime getBuyTime() {
        return buyTime;
    }

    public void setBuyTime(LocalDateTime buyTime) {
        this.buyTime = buyTime;
    }

    public LocalDate getDeadLineDate() {
        return deadLineDate;
    }

    public void setDeadLineDate(LocalDate deadLineDate) {
        this.deadLineDate = deadLineDate;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public Deal(User seller, User buyer, Product[] products, LocalDateTime buyTime, LocalDate deadLineDate, int index) {
        this.seller = seller;
        this.buyer = buyer;
        this.products = products;
        this.buyTime = buyTime;
        this.deadLineDate = LocalDate.now().plusDays(10);
        this.index = index;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Deal deal = (Deal) o;
        return index == deal.index && seller.equals(deal.seller) && buyer.equals(deal.buyer) && Arrays.equals(products, deal.products) && buyTime.equals(deal.buyTime) && deadLineDate.equals(deal.deadLineDate);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(seller, buyer, buyTime, deadLineDate, index);
        result = 31 * result + Arrays.hashCode(products);
        return result;
    }

    public Deal() {
        super();
        this.products = new Product[5];
    }

    public void deal() {
        double sum = 0;
        for (Product element : products) {
            sum += element.getCalcFinalPrice();
        }
        double buyerMoney = buyer.getMoney() - sum;
        buyer.setMoney(buyerMoney);

        double sellerMoney = seller.getMoney() + sum;
        seller.setMoney(sellerMoney);

        this.deadLineDate = LocalDate.now().plusDays(10);
    }

    void grow() {
        int newLength = (int) (products.length == 0 ? 1 : products.length * 1.5);
        Product[] newProducts = new Product[newLength];
        System.arraycopy(products, 0, newProducts, 0, products.length);
        products = newProducts;
    }

    public Product getProduct(int productIndex) {
        return products[productIndex];
    }

    public void addProduct(Product product) {
        if (index == products.length) {
            grow();
        }
        products[index] = product;
        index++;
    }

    public void removeProduct(Product product) {
        for (int i = products.length - 1; i >= 0; i--) {
            if (products[i] != null) {
                index = i + 1;
                break;
            }
        }
        if (index < 0 || index >= products.length) {
            System.out.println("this product is out of stock");
            return;
        }
        for (int i = 0; i < index; i++) {
            if (products[i] == product) {
                for (int j = i; j < index - 1; j++) {
                    products[j] = products[j + 1];
                }
                products[index - 1] = null;
                index = index - 1;
                break;
            }
        }
    }

    public String toString() {
        return this.buyer + " " + this.seller + " " + this.products;
    }

    public void check() {
        System.out.println("Seller: " + seller.getName());
        System.out.println("Buyer: " + buyer.getName());
        System.out.println("Purchase time: " + (this.buyTime = LocalDateTime.now()));
        for (Product element : products) {
            System.out.println("Product: " + element.getProdName() + ":" + " quantity: " + element.getQuantity() + " *" + " price: " + element.getPrice() + " = " + " final price: " + element.getCalcFinalPrice());
        }
    }
}
