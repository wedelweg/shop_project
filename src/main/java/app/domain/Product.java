package app.domain;

import java.util.Objects;

public class Product {
    private final long id;
    private boolean isActive;
    private String name;
    private double price;

    public Product(Long id, boolean isActive, String name, double price) {
        this.id = id;
        this.isActive = isActive;
        this.name = name;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return id == product.id && isActive == product.isActive && Double.compare(price, product.price) == 0 && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, isActive, name, price);
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", isActive=" + isActive +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}