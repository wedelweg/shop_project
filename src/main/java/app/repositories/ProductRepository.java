package app.repositories;

import app.domain.Product;
import java.util.List;

public interface ProductRepository {

    Product save(Product product);
    List<Product> getAll();
    Product getById(long id);
    void deleteById(long id);
    boolean existsById(long id);
}
