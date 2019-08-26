package service;

import pojo.Product;

import java.util.List;

public interface ProductService {

    public List<Product> list();

    List<Product> getP(Class<Product> productClass, int id);

    void deleteP(Product P);

    void add(Product product);

    void updateP(Product product);
}