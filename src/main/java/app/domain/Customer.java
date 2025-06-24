package app.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

//POJO - Plain Old Java Object
public class Customer {
    private final long id;
    private boolean isActive;
    private String name;
    private final List<Product> products = new ArrayList<>();

    public Customer(long id, boolean isActive, String name) {
        this.id = id;
        this.isActive = isActive;
        this.name = name;
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

    public List<Product> getProducts() {
        return products;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Customer)) return false;
        Customer customer = (Customer) o;
        return id == customer.id && isActive == customer.isActive && Objects.equals(name, customer.name) && Objects.equals(products, customer.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, isActive, name, products);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", isActive=" + isActive +
                ", name='" + name + '\'' +
                ", products=" + products +
                '}';
    }
}