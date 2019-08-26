package dao;

import pojo.Product;

import java.util.List;

public interface ProductDAO2 {

    public List<Product> list();
    public void add(Product p);
    public Product getP(Class<Product> productClass, int id);
    void deleteP(Product p);
    void updateP(Product p);
}