package ru.imbabot.hibernate;

import ru.imbabot.hibernate.Entities.Product;
import ru.imbabot.hibernate.Repositories.ProductDao;
import ru.imbabot.hibernate.Repositories.ProductDaoImplement;
import ru.imbabot.hibernate.Utils.SessionFactoryUtils;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        SessionFactoryUtils sessionFactoryUtils = new SessionFactoryUtils();
        sessionFactoryUtils.init();
        try {

            ProductDao productDao = new ProductDaoImplement(sessionFactoryUtils);
            Product product = productDao.findById(1l);
            System.out.println(product);

            List<Product> products = productDao.findAll();

            Product p = new Product(5l, "something", 100);

            productDao.deleteById(1l);



            productDao.saveOrUpdate(p);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sessionFactoryUtils.shutDown();
        }
    }
}
