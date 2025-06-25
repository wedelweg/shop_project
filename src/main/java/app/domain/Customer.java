package app.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Customer {
    private Long id;
    private boolean isActive;
    private String name;
    private final List<Product> products = new ArrayList<>();

    public Customer(boolean isActive, String name) {
        this.isActive = isActive;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) { // ← этот метод обязателен
        this.id = id;
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

    // equals(), hashCode(), toString() — по желанию
}
