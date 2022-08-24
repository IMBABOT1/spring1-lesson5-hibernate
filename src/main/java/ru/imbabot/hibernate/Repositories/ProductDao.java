package ru.imbabot.hibernate.Repositories;

import ru.imbabot.hibernate.Entities.Product;

import java.util.List;

public interface ProductDao {

    Product findById(Long id);
    List<Product> findAll();
    void deleteById(Long id);
    Product saveOrUpdate(Product product);

}
