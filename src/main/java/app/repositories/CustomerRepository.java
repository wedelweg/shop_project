package app.repositories;

import app.domain.Customer;
import java.util.List;

public interface CustomerRepository {

    void save(Customer customer);                  // сохранить или обновить
    Customer findById(long id);                    // найти по ID
    List<Customer> findAll();                      // получить всех
    void deleteById(long id);                      // удалить по ID
    boolean existsById(long id);                   // проверить, существует ли
}
