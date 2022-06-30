package by.academy.Deal;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Objects;

public class Deal {
    private User seller;
    private User buyer;
    private Product[] products;
    private LocalDateTime buyTime;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Deal deal = (Deal) o;
        return seller.equals(deal.seller) && buyer.equals(deal.buyer) && Arrays.equals(products, deal.products);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(seller, buyer);
        result = 31 * result + Arrays.hashCode(products);
        return result;
    }

    public Deal(User seller, User buyer, Product[] products) {
        this.seller = seller;
        this.buyer = buyer;
        this.products = products;
    }

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

    public double calcFullPrice() {
        return 0;
    }

    public void printBill() {
        if (products == null) {
            return;
        }
        double fullprice = fullPrice();
        for (int p = 0; p < products.length; p++) {
            System.out.println(products[p].calcPrice());
        }

        for (Product p : products) {
            System.out.println(p.calcPrice());
        }
        double buyerMoney = buyer.getMoney();
        buyer.setMoney(buyer.getMoney() - fullprice);
        seller.setMoney(seller.getMoney() + fullprice);

    }

    public double fullPrice() {
        double price = 0;
        for (Product p : products) {
            price += p.calcPrice();
        }
        return price;
    }

    public void deal() {
        buyTime = LocalDateTime.now();
        printBill();
    }
}

